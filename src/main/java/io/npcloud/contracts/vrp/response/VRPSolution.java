package io.npcloud.contracts.vrp.response;

import io.npcloud.contracts.vrp.IVerify;

import java.util.ArrayList;
import java.util.List;

/**
 * VRP task's solution
 */
public class VRPSolution implements IVerify{

    @Override
    public List<String> verify(String prefix) {
        //check individual fields
        List<String> errors = new ArrayList<>();
        validNonNegative(prefix + ".distance", distance, errors);
        validNonNegative(prefix + ".transportTime", transportTime, errors);
        validNonNegative(prefix + ".completionTime", completionTime, errors);
        validNonNegative(prefix + ".maxOperationTime", maxOperationTime, errors);
        validNonNegative(prefix + ".waitingTime", waitingTime, errors);
        validNonNegative(prefix + ".waitingTime", numberVehicles, errors);

        if(routeList != null){
            int i = 0;
            for(VRPRoute route: routeList) {
                errors.addAll(route.verify(prefix + ",route[" + i + "]"));
                i++;
            }
        }

        if(unassigned == null){
            unassigned = new VRPUnassigned();
        }else{
            errors.addAll(unassigned.verify(prefix + ".unassigned"));
        }
        //cross-check: locationId
        //cross-check: vehicle
        //cross-check: unassigned
        //check objectives: run in vrp simulation engine
        return null;
    }

    //over all distance travelled in meters
    private Long distance;

    //sum of each router's transport time in seconds
    private Long transportTime;

    //overall completion time in seconds
    private Long completionTime;

    //Operation time of Longest route in seconds
    private Long maxOperationTime;

    //Overall waiting time in seconds
    private Long waitingTime;

    //number of employed vechicles
    private Integer numberVehicles;

    //list of routes
    private List<VRPRoute> routeList;

    //unassigned services and shipments
    private VRPUnassigned unassigned;

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Long getTransportTime() {
        return transportTime;
    }

    public void setTransportTime(Long transportTime) {
        this.transportTime = transportTime;
    }

    public Long getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(Long completionTime) {
        this.completionTime = completionTime;
    }

    public Long getMaxOperationTime() {
        return maxOperationTime;
    }

    public void setMaxOperationTime(Long maxOperationTime) {
        this.maxOperationTime = maxOperationTime;
    }

    public Long getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Long waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getNumberVehicles() {
        return numberVehicles;
    }

    public void setNumberVehicles(int numberVehicles) {
        this.numberVehicles = numberVehicles;
    }

    public List<VRPRoute> getRouteList() {
        return routeList;
    }

    public void setRouteList(List<VRPRoute> routeList) {
        this.routeList = routeList;
    }

    public VRPUnassigned getUnassigned() {
        return unassigned;
    }

    public void setUnassigned(VRPUnassigned unassigned) {
        this.unassigned = unassigned;
    }


}
