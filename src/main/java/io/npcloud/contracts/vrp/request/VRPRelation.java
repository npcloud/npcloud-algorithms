package io.npcloud.contracts.vrp.request;

import java.util.List;

/**
 * additional relations ou can use to establish a
 * relationship between services and shipments:
 */
public class VRPRelation {

    /**
     * type of relation
     * Currently only IN_SAME_ROUTE relation is supported
     *
     */
    private VRPRelation type;

    /**
     * service/shipments ids
     */
    private List<String> ids;

    /**
     * vehicle pre-assigned for services, optional
     */
    private String vehicleId;

    public VRPRelation getType() {
        return type;
    }

    public void setType(VRPRelation type) {
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
