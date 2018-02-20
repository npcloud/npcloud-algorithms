package io.npcloud.contracts.vrp.request;

public class VRPTimeWindow {
    private Long earliest;
    private Long latest;

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
}
