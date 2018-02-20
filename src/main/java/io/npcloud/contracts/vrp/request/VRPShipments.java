package io.npcloud.contracts.vrp.request;

import java.util.List;

public class VRPShipments {
    private String id;
    private String name;
    private VRPPickup pickup;
    private VRPDelivery delivery;
    private List<Integer> size;
    private List<String> requiredSkills;
    private List<String> allowedVehicles;
    private List<String> disallowedVehicles;
    private Integer priority;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VRPPickup getPickup() {
        return pickup;
    }

    public void setPickup(VRPPickup pickup) {
        this.pickup = pickup;
    }

    public VRPDelivery getDelivery() {
        return delivery;
    }

    public void setDelivery(VRPDelivery delivery) {
        this.delivery = delivery;
    }

    public List<Integer> getSize() {
        return size;
    }

    public void setSize(List<Integer> size) {
        this.size = size;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public List<String> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<String> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public List<String> getDisallowedVehicles() {
        return disallowedVehicles;
    }

    public void setDisallowedVehicles(List<String> disallowedVehicles) {
        this.disallowedVehicles = disallowedVehicles;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
