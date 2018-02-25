package io.npcloud.contracts.vrp.response;

import java.util.List;

/**
 *
 */
public class VRPPoint {

    private List<Double> coordinates;

    private String type;

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
