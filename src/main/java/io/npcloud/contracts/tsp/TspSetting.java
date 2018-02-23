package io.npcloud.contracts.tsp;

import java.util.List;

/**
 * task input contains a list of points
 */
public class TspSetting {

    private List<TspPoint> points;

    public List<TspPoint> getPoints() {
        return points;
    }

    public void setPoints(List<TspPoint> points) {
        this.points = points;
    }
}
