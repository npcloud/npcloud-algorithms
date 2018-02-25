package io.npcloud.contracts.vrp.request;

import io.npcloud.contracts.vrp.IVerify;
import io.npcloud.contracts.vrp.common.VRPRelationType;

import java.util.ArrayList;
import java.util.List;

/**
 * additional relations ou can use to establish a
 * relationship between services and shipments:
 */
public class VRPRelation implements IVerify {

    @Override
    public List<String> verify(String prefix) {
        List<String> errors = new ArrayList<>();
        notNull(prefix + ".type", type, errors);
        notEmpty(prefix + ".ids", ids, errors);
        if(type != null || !type.equals(VRPRelationType.IN_SAME_ROUTE.name())){
            errors.add(prefix + ".type is not valid");
        }
        return errors;
    }

    /**
     * type of relation
     * Currently only IN_SAME_ROUTE relation is supported
     *
     */
    private VRPRelationType type;

    /**
     * service/shipments ids
     */
    private List<String> ids;

    /**
     * vehicle pre-assigned for services, optional
     */
    private String vehicleId;

    public VRPRelationType getType() {
        return type;
    }

    public void setType(VRPRelationType type) {
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
