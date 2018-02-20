package io.npcloud.contracts.vrp.request;

import java.util.List;

public class VRPBreak {
    private Long earliest;
    private Long lastest;
    private Long duration;
    private Long maxDrivingTime;
    private List<Integer> possibleSplit;
    private Long initalDrivingTime;

    public Long getEarliest() {
        return earliest;
    }

    public void setEarliest(Long earliest) {
        this.earliest = earliest;
    }

    public Long getLastest() {
        return lastest;
    }

    public void setLastest(Long lastest) {
        this.lastest = lastest;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getMaxDrivingTime() {
        return maxDrivingTime;
    }

    public void setMaxDrivingTime(Long maxDrivingTime) {
        this.maxDrivingTime = maxDrivingTime;
    }

    public List<Integer> getPossibleSplit() {
        return possibleSplit;
    }

    public void setPossibleSplit(List<Integer> possibleSplit) {
        this.possibleSplit = possibleSplit;
    }

    public Long getInitalDrivingTime() {
        return initalDrivingTime;
    }

    public void setInitalDrivingTime(Long initalDrivingTime) {
        this.initalDrivingTime = initalDrivingTime;
    }
}
