package io.npcloud.contracts.vrp.request;

import java.util.List;

public class VRPCostMatrix {

    private String profile;

    private List<String> locationIds;

    private int[][] timeMatrix;

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
