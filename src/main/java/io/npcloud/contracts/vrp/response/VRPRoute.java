package io.npcloud.contracts.vrp.response;

import io.npcloud.contracts.vrp.IVerify;

import java.util.ArrayList;
import java.util.List;

/**
 * Route object describe the path of a vehicle
 */
public class VRPRoute implements IVerify {

    @Override
    public List<String> verify(String prefix) {
        List<String> errors = new ArrayList<>();
        notEmpty(prefix + ".vehicleId", vehicleId , errors);
        validNonNegative(prefix + ".distance", distance , errors);
        validNonNegative(prefix + ".transportTime", transportTime , errors);
        validNonNegative(prefix + ".completionTime", completionTime , errors);
        validNonNegative(prefix + ".waitingTime", waitingTime , errors);
        notEmpty(prefix + ".activities", activities , errors);
        if(activities != null){
            for(VRPActivity activity: activities){
                errors.addAll(activity.verify(prefix + "activity(id=" + activity.getId() + ")"));
            }
        }
        return errors;
    }


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
