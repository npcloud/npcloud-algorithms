package io.npcloud.contracts.vrp.request;

/**
 * Time window object
 */
public class VRPTimeWindow {
    /**
     * unix timestamp for window start
     */
    private Long earliest;

    /**
     * unix timestamp for window end
     */
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
