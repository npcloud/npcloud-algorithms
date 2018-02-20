package io.npcloud.contracts.vrp.request;

public class VRPDelivery {
    private String address;
    private Long duration;
    private VRPTimeWindow timeWindow;
    private Long preparationTime;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
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
