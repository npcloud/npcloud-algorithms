package io.npcloud.contracts.vrp.request;

import io.npcloud.contracts.vrp.common.VRPAddress;

import java.util.List;

/**
 * vehicle instance
 */
public class VRPVehicle {
    private String vehicleId;
    private String typeId;
    private VRPAddress startAddress;
    private VRPAddress endAddress;
    private Integer returnToDepot = 1;
    private Long earliestStart = 0L;
    private Long latestEnd = Long.MAX_VALUE;
    private List<String> skills;
    private VRPBreak vrpBreak;
    private Long maxDistance = Long.MAX_VALUE;
    private Long maxDrivingTime = Long.MAX_VALUE;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public VRPAddress getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(VRPAddress startAddress) {
        this.startAddress = startAddress;
    }

    public VRPAddress getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(VRPAddress endAddress) {
        this.endAddress = endAddress;
    }

    public Integer getReturnToDepot() {
        return returnToDepot;
    }

    public void setReturnToDepot(Integer returnToDepot) {
        this.returnToDepot = returnToDepot;
    }

    public Long getEarliestStart() {
        return earliestStart;
    }

    public void setEarliestStart(Long earliestStart) {
        this.earliestStart = earliestStart;
    }

    public Long getLatestEnd() {
        return latestEnd;
    }

    public void setLatestEnd(Long latestEnd) {
        this.latestEnd = latestEnd;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public VRPBreak getVrpBreak() {
        return vrpBreak;
    }

    public void setVrpBreak(VRPBreak vrpBreak) {
        this.vrpBreak = vrpBreak;
    }

    public Long getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(Long maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Long getMaxDrivingTime() {
        return maxDrivingTime;
    }

    public void setMaxDrivingTime(Long maxDrivingTime) {
        this.maxDrivingTime = maxDrivingTime;
    }
}
