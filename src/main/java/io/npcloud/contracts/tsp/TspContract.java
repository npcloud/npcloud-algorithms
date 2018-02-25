package io.npcloud.contracts.tsp;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import io.npcloud.contracts.IContract;

import java.util.*;

/**
 * Tsp contract ask for optimization result of TravelSalesman Problem
 */
public class TspContract implements IContract<TspSetting, TspSolution, Double> {
    @Override
    public String getName() {
        return "TspContract";
    }

    @Override
    public Class getContractClass() {
        return this.getClass();
    }

    @Override
    public Class getSettingClass() {
        return TspSetting.class;
    }

    @Override
    public Class getSolutionClass() {
        return TspSolution.class;
    }

    @Override
    public Double getObjectives(TspSolution tspSolution) {
        return tspSolution.getDistance();
    }

    /**
     * verify optimization task
     * @param tspSetting
     * @return
     */
    @Override
    public List<String> checkSetting(TspSetting tspSetting) {
        Set<String> ids = new HashSet<>();
        List<String> errors = new ArrayList<>();
        if(tspSetting.getPoints() == null || tspSetting.getPoints().size() > 100 || tspSetting.getPoints().size() == 0){
            errors.add("point number should be larger than 0 and less than 100");
            return errors;
        }
        for(TspPoint p :tspSetting.getPoints()) {
            if (p.getId() == null || p.getId().isEmpty()) {
                errors.add("point has empty id");
                return errors;
            }
            if (p.getX() == null || p.getY() == null) {
                errors.add("point " + p.getId() + " is invalid");
            }
            if(ids.contains(p.getId())){
                errors.add("point " + p.getId() + " id duplicate");
            }
            ids.add(p.getId());
        }
        return errors;
    }

    /**
     * optimization should match input
     * @param tspSetting
     * @param tspSolution
     * @return
     */
    @Override
    public List<String> checkSolution(TspSetting tspSetting, TspSolution tspSolution) {
        if(tspSolution.getDistance() <= 0){
            return ImmutableList.of("distance should be larger than 0");
        }
        if(tspSolution.getTravelPoints() == null || tspSolution.getTravelPoints().size() != tspSetting.getPoints().size()){
            return ImmutableList.of("point number in solution does not match point number in the input");
        }
        Map<String, TspPoint> pointMap = new HashMap<>();
        for (TspPoint tspPoint : tspSetting.getPoints()) {
            pointMap.put(tspPoint.getId(), tspPoint);
        }
        List<TspPoint> points = new ArrayList<>();
        for(String id: tspSolution.getTravelPoints()){
            if(!pointMap.containsKey(id)){
                return ImmutableList.of("point " + id + " is not in the input");
            }
            points.add(pointMap.get(id));
        }
        double dist = TspPoint.distance(points);
        if(Math.abs(dist - tspSolution.getDistance()) < 1e-10){
            return ImmutableList.of();
        }else{
            return ImmutableList.of("distance is not valid");
        }

    }

    public static void main(String[] args){
        TspSetting setting = new TspSetting();
        setting.setPoints(ImmutableList.of(new TspPoint("1", 0.0, 0.0),
                new TspPoint("2", null, 1.0)));
        TspSolution solution = new TspSolution();
        solution.setDistance(2.8284271247461903);
        solution.setTravelPoints(ImmutableList.of("1", "2"));
        System.out.println(new TspContract().checkSetting(setting));
        System.out.println(new TspContract().checkSolution(setting, solution));
    }
}
