package io.npcloud.contracts.vrp.request;

import java.util.List;

/**
 * Vehicle operation break
 */
public class VRPBreak {

    /**
     * earliest start time of the break
     */
    private Long earliest;

    /**
     * latest start time of the break
     */
    private Long latest;

    /**
     * duration of the break in second
     */
    private Long duration;

    /**
     * max driving time without break in second
     */
    private Long maxDrivingTime;

    /**
     * specify how a break duration can be split into smaller breaks
     */
    private List<Integer> possibleSplit;

    /**
     * specify the initial driving time of the vehicle
     */
    private Long initialDrivingTime;

    public Long getEarliest() {
        return earliest;
    }

    public void setEarliest(Long earliest) {
        this.earliest = earliest;
    }

    public Long getLatest() {
        return latest;
    }

    public void setLatest(Long latest) {
        this.latest = latest;
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

    public Long getInitialDrivingTime() {
        return initialDrivingTime;
    }

    public void setInitialDrivingTime(Long initialDrivingTime) {
        this.initialDrivingTime = initialDrivingTime;
    }
}
