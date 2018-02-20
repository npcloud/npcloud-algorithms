package io.npcloud.contracts.vrp.request;

import java.util.List;

public class VRPRelation {

    public enum VRPRelationType{
        IN_SAME_ROUTE,
        IN_SEQUENCE,
        IN_DIRECT_SEQUENCE;
    }

    private String type;

    private List<String> ids;

    private String vehicleId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
}
