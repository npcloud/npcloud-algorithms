package io.npcloud.contracts.vrp.request;

import io.npcloud.contracts.vrp.IVerify;
import io.npcloud.contracts.vrp.common.VRPAddress;

import java.util.ArrayList;
import java.util.List;

/**
 * vehicle instance
 */
public class VRPVehicle implements IVerify{
    /**
     * vehicle id
     */
    private String vehicleId;

    /**
     * vehicle type id
     */
    private String typeId;

    /**
     * start address
     */
    private VRPAddress startAddress;

    /**
     * end address
     */
    private VRPAddress endAddress;

    /**
     * if the vehicle need to return to the start position
     */
    private Integer returnToDepot = 1;

    /**
     * earliest working time
     */
    private Long earliestStart = 0L;

    /**
     * latest working time
     */
    private Long latestEnd = Long.MAX_VALUE;

    /**
     * skills of this vehicle
     */
    private List<String> skills = new ArrayList<>();

    /**
     * max travel distance of this vehicle
     */
    private Long maxDistance = Long.MAX_VALUE;

    /**
     * max driving time for this vehicle
     */
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

    @Override
    public List<String> verify(String prefix) {
        List<String> errors = new ArrayList<>();
        notEmpty(prefix + ".vehileId", vehicleId, errors);
        notEmpty(prefix + ".typeId", typeId, errors);
        notNull(prefix + ".startAddress", startAddress, errors);
        notNull(prefix + ".endAddress", endAddress, errors);
        if(returnToDepot == null || returnToDepot != 1){
            returnToDepot = 0;
        }
        if(earliestStart == null){
            earliestStart = 0L;
        }
        validNonNegative(prefix + ".earliestStart", earliestStart, errors);

        if(latestEnd == null){
            latestEnd = Long.MAX_VALUE;
        }
        validNonNegative(prefix + ".latestEnd", latestEnd, errors);

        if(maxDistance == null){
            maxDistance = Long.MAX_VALUE;
        }
        validNonNegative(prefix + ".maxDistance", maxDistance, errors);

        if(maxDrivingTime == null){
            maxDrivingTime = Long.MAX_VALUE;
        }
        validNonNegative(prefix + ".maxDrivingTime", maxDrivingTime, errors);

        if(startAddress != null){
            errors.addAll(startAddress.verify(prefix + ".startAddress"));
        }

        if(endAddress != null){
            errors.addAll(endAddress.verify(prefix + ".endAddress"));
        }
        return errors;
    }
}
