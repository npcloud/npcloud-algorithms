package io.npcloud.contracts.vrp;

import io.npcloud.contracts.vrp.response.VRPUnassigned;

public class VRPObjective {
    //over all distance travelled in meters
    private Long distance;

    //sum of each router's transport time in seconds
    private Long transportTime;

    //overall completion time in seconds
    private Long completionTime;

    //Operation time of Longest route in seconds
    private Long maxOperationTime;

    //Overall waiting time in seconds
    private Long waitingTime;

    //number of employed vechicles
    private int numberVehicles;

    //unassigned services and shipments
    private VRPUnassigned unassigned;

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

    public Long getMaxOperationTime() {
        return maxOperationTime;
    }

    public void setMaxOperationTime(Long maxOperationTime) {
        this.maxOperationTime = maxOperationTime;
    }

    public Long getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Long waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getNumberVehicles() {
        return numberVehicles;
    }

    public void setNumberVehicles(int numberVehicles) {
        this.numberVehicles = numberVehicles;
    }

    public VRPUnassigned getUnassigned() {
        return unassigned;
    }

    public void setUnassigned(VRPUnassigned unassigned) {
        this.unassigned = unassigned;
    }
}
