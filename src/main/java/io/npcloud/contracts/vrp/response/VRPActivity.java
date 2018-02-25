package io.npcloud.contracts.vrp.response;

import io.npcloud.contracts.vrp.common.VRPActivityWorkType;
import io.npcloud.contracts.vrp.common.VRPAddress;

import java.util.List;

/**
 * Describe vehicle's activity at one stop
 */
public class VRPActivity {

    //Specifies the type of activity.
    // See VRPActivityWorkType
    private VRPActivityWorkType type;

    //id to the service or the shipment,
    private String id;

    //address id of either the address of service or te address
    //of hte shipment pickup or deliver
    private String locationId;

    //address detail
    private VRPAddress address;

    //arrival time to location
    private Long arrTime;

    //end time at location
    private Long endTime;

    //waiting time at location, in seconds
    private Long waitingTime;

    //cumulated distance
    private Long distance;

    //capacity before activity
    private List<Integer> loadBefore;

    //capacity after activity
    private List<Integer> loadAfter;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public VRPAddress getAddress() {
        return address;
    }

    public void setAddress(VRPAddress address) {
        this.address = address;
    }

    public Long getArrTime() {
        return arrTime;
    }

    public void setArrTime(Long arrTime) {
        this.arrTime = arrTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Long waitingTime) {
        this.waitingTime = waitingTime;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public List<Integer> getLoadBefore() {
        return loadBefore;
    }

    public void setLoadBefore(List<Integer> loadBefore) {
        this.loadBefore = loadBefore;
    }

    public List<Integer> getLoadAfter() {
        return loadAfter;
    }

    public void setLoadAfter(List<Integer> loadAfter) {
        this.loadAfter = loadAfter;
    }

    public void setType(VRPActivityWorkType type) {
        this.type = type;
    }
}
