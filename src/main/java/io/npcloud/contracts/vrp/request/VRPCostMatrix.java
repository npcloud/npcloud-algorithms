package io.npcloud.contracts.vrp.request;

import io.npcloud.contracts.vrp.IVerify;

import java.util.ArrayList;
import java.util.List;

/**
 * cost travel from point to point
 */
public class VRPCostMatrix implements IVerify {

    /**
     * vehicle type
     */
    private String profile ="car";

    /**
     * locations
     */
    private List<String> locationIds;

    /**
     * time travel from place to place, under time speedFactor 1.0
     * for example, you can query time from location[0] to location[2]
     * by timeMatrix[0][2]
     */
    private int[][] timeMatrix;

    /**
     * distance travel from place to place
     * for example, you can query distance from location[0] to location[2]
     * by distanceMatrix[0][2]
     */
    private int[][] distanceMatrix;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public List<String> getLocationIds() {
        return locationIds;
    }

    public void setLocationIds(List<String> locationIds) {
        this.locationIds = locationIds;
    }

    public int[][] getTimeMatrix() {
        return timeMatrix;
    }

    public void setTimeMatrix(int[][] timeMatrix) {
        this.timeMatrix = timeMatrix;
    }

    public int[][] getDistanceMatrix() {
        return distanceMatrix;
    }

    public void setDistanceMatrix(int[][] distanceMatrix) {
        this.distanceMatrix = distanceMatrix;
    }

    @Override
    public List<String> verify(String prefix) {
        List<String> errors = new ArrayList<>();
        notEmpty(prefix + ".profile", profile, errors);
        notEmpty(prefix + ".locationIds", locationIds, errors);
        int size = locationIds.size();
        if(timeMatrix == null || size != timeMatrix.length){
            errors.add(prefix + ".timeMatrix size does not match location size");
        }else {
            for (int i = 0; i < timeMatrix.length; i++) {
                if (timeMatrix[i] == null || timeMatrix[i].length == 0
                        || timeMatrix[i].length != size) {
                    errors.add(prefix + ".timeMatrix size does not match location size");
                } else {
                    for (int j = 0; j < timeMatrix[i].length; j++){
                        if(timeMatrix[i][j] < 0){
                            errors.add(prefix + ".timeMatrix value should larger than 0");
                        }
                    }
                }
            }
        }

        if(distanceMatrix == null || size != distanceMatrix.length){
            errors.add(prefix + ".distanceMatrix size does not match location size");
        }else {
            for (int i = 0; i < distanceMatrix.length; i++) {
                if (distanceMatrix[i] == null || distanceMatrix[i].length == 0
                        || distanceMatrix[i].length != size) {
                    errors.add(prefix + ".distanceMatrix size does not match location size");
                } else {
                    for (int j = 0; j < distanceMatrix[i].length; j++){
                        if(distanceMatrix[i][j] < 0){
                            errors.add(prefix + ".timeMatrix value should larger than 0");
                        }
                    }
                }
            }
        }
        return errors;
    }
}
