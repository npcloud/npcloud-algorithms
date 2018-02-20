package io.npcloud.contracts.vrp.response;

import io.npcloud.contracts.vrp.common.VRPAddress;

import java.util.List;

public class VRPActivity {

    private String type;

    private String id;

    private String locationId;

    private VRPAddress address;

    private Long arrTime;

    private Long endTime;

    private Long waitingTime;

    private Long distance;

    private List<Integer> loadBefore;

    private List<Integer> loadAfter;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
}
