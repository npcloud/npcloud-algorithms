package io.npcloud.contracts.vrp.request;

import io.npcloud.contracts.vrp.IVerify;

import java.util.ArrayList;
import java.util.List;

/**
 * currently we support two object type: min, max
 */
public class VRPObjective implements IVerify{

    @Override
    public List<String> verify(String prefix) {
        List<String> errors = new ArrayList<>();
        notNull(prefix + ".type", type, errors);
        notNull(prefix + ".value", value, errors);

        //check type
        if(type != null && !(type.equals(VRPObjectiveType.min.name())
                || type.equals(VRPObjectiveType.minmax.name()))){
            errors.add(prefix + ".type is not valid");
        }

        //check object value
        if(value != null && !(value.equals(VRPObjectClass.vehicles.name())
                || value.equals(VRPObjectClass.transportTime.name())
                || value.equals(VRPObjectClass.completionTime.name())
        )){
            errors.add(prefix + ".value is not valid");
        }

        return errors;
    }

    public enum VRPObjectiveType{
        min, minmax
    }

    public enum VRPObjectClass{
        vehicles, transportTime, completionTime
    }

    private String type = "min";
    private String value = "transportTime";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
