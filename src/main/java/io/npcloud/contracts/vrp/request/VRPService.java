package io.npcloud.contracts.vrp.request;

import io.npcloud.contracts.vrp.common.VRPAddress;

import java.util.List;

public class VRPService {
    private String id;
    private String type = "service";
    private String name;
    private VRPAddress address;
    private Long duration;
    private List<Integer> size;
    private VRPTimeWindow timeWindow;
    private List<String> requiredSkills;
    private List<String> requiredVehicles;
    private List<String> disallowedVehicles;
    private Integer priority;
    private Long preparationTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VRPAddress getAddress() {
        return address;
    }

    public void setAddress(VRPAddress address) {
        this.address = address;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public List<Integer> getSize() {
        return size;
    }

    public void setSize(List<Integer> size) {
        this.size = size;
    }

    public VRPTimeWindow getTimeWindow() {
        return timeWindow;
    }

    public void setTimeWindow(VRPTimeWindow timeWindow) {
        this.timeWindow = timeWindow;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public List<String> getRequiredVehicles() {
        return requiredVehicles;
    }

    public void setRequiredVehicles(List<String> requiredVehicles) {
        this.requiredVehicles = requiredVehicles;
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

    public Long getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Long preparationTime) {
        this.preparationTime = preparationTime;
    }
}
