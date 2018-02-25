package io.npcloud.contracts.vrp.request;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * vehicle type definition
 */
public class VRPVehicleType {

    /**
     * type id
     */
    private String typeId;

    /**
     * capacity of the vehicle
     */
    private List<Integer> capacity = ImmutableList.of(0);

    /**
     * Specifies a speed factor for this vehicle type.
     * For example, If the vehicle  needs to be only half as fast as,
     * or meaning using twice time to travel form place to place,
     * (see timeMatrix in in VRPCostMatrix) , then set the speed factor to 0.5.
     */
    private Double speedFactor = 1.0;

    /**
     * Specifies a service time factor for this vehicle type.
     * For example, if the vehicle/driver is able to conduct the
     * service as double as fast as the setting in the corresponding
     * service or shipment (see duration field) then set it to 0.5.
     */
    private Double serviceTimeFactor = 1.0;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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
