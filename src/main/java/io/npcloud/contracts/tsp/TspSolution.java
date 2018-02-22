package io.npcloud.contracts.tsp;

import java.util.List;

public class TspSolution {

    private Double distance;

    private List<String> travelPoints;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<String> getTravelPoints() {
        return travelPoints;
    }

    public void setTravelPoints(List<String> travelPoints) {
        this.travelPoints = travelPoints;
    }
}
