package io.npcloud.contracts.vrp.request;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class VRPVehicleType {
    private String typeId;

    private String profile = "car";

    private List<Integer> capacity = ImmutableList.of(0);

    private Double speedFactor = 1.0;

    private Double serviceTimeFactor = 1.0;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public List<Integer> getCapacity() {
        return capacity;
    }

    public void setCapacity(List<Integer> capacity) {
        this.capacity = capacity;
    }

    public Double getSpeedFactor() {
        return speedFactor;
    }

    public void setSpeedFactor(Double speedFactor) {
        this.speedFactor = speedFactor;
    }

    public Double getServiceTimeFactor() {
        return serviceTimeFactor;
    }

    public void setServiceTimeFactor(Double serviceTimeFactor) {
        this.serviceTimeFactor = serviceTimeFactor;
    }
}
