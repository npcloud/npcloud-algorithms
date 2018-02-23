package io.npcloud.contracts.tsp;

import java.util.List;

/**
 * solution result contains a travel path passing all points and returning to the first point
 * , and the total distance travelled
 */
public class TspSolution {

    /**
     * total travel distance
     */
    private Double distance;

    /**
     * travel path of all points. For example, if there are three point 1,2 and 3
     * then valid travel points can be [1,2,3] or [2,3,1], etc.
     */
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
