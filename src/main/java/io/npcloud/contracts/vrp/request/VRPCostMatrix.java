package io.npcloud.contracts.vrp.request;

import java.util.List;

/**
 * cost travel from point to point
 */
public class VRPCostMatrix {

    /**
     * vehicle type
     */
    private String profile;

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
}
