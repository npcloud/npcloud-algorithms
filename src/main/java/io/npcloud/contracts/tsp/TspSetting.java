package io.npcloud.contracts.tsp;

import java.util.List;

public class TspSetting {
    private List<TspPoint> points;

    public List<TspPoint> getPoints() {
        return points;
    }

    public void setPoints(List<TspPoint> points) {
        this.points = points;
    }
}
