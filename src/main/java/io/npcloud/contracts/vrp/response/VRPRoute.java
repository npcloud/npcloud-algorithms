package io.npcloud.contracts.vrp.response;

import java.util.List;

/**
 * Route object describe the path of a vehicle
 */
public class VRPRoute {
    //id of vechicle operating the route
    private String vehicleId;

    //travel distance of the route
    private Long distance;

    //travel time of the route
    private Long transportTime;

    // completion time of the route
    private Long completionTime;

    //overall waiting time
    private Long waitingTime;

    //activities
    private List<VRPActivity> activities;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

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

    public Long getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Long waitingTime) {
        this.waitingTime = waitingTime;
    }


    public List<VRPActivity> getActivities() {
        return activities;
    }

    public void setActivities(List<VRPActivity> activities) {
        this.activities = activities;
    }
}
