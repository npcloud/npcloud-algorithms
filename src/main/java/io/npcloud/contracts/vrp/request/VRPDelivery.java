package io.npcloud.contracts.vrp.request;

import io.npcloud.contracts.vrp.common.VRPAddress;

public class VRPDelivery {
    /**
     * service address
     */
    private VRPAddress address;

    /**
     * how long will the vehicle stay at location
     */
    private Long duration = 0L;

    /**
     * List of time window.
     * Unix timestamp are used in VRPTimeWindow
     */
    private VRPTimeWindow timeWindow;

    /**
     * Specifies the preparation time in seconds. It can be used to model
     * parking lot search time since if you have 3 identical locations in a row,
     *it only falls due once.
     */
    private Long preparationTime;

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

    public VRPTimeWindow getTimeWindow() {
        return timeWindow;
    }

    public void setTimeWindow(VRPTimeWindow timeWindow) {
        this.timeWindow = timeWindow;
    }

    public Long getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Long preparationTime) {
        this.preparationTime = preparationTime;
    }

}
