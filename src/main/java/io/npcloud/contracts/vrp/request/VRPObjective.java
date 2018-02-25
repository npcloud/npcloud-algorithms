package io.npcloud.contracts.vrp.request;

/**
 * currently we support two object type: min, max
 */
public class VRPObjective {

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
