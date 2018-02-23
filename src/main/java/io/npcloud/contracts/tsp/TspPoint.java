package io.npcloud.contracts.tsp;

import java.util.List;

/**
 * each point contains a point id, x coordinate value and y coordinate value
 */
public class TspPoint {
    private String id;
    private Double x;
    private Double y;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public TspPoint() {
    }

    public TspPoint(String id, Double x, Double y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public static double distance(final List<TspPoint> points) {
        final int len = points.size();
        double d = points.get(len-1).distance(points.get(0));
        for(int i = 1; i < len; i++)
            d += points.get(i - 1).distance(points.get(i));
        return d;
    }

    /**
     * Euclidean distance.
     */
    public final double distance(final TspPoint to) {
        return Math.sqrt(_distance(to));
    }

    /**
     * compare 2 points.
     * no need to square when comparing.
     * http://en.wikibooks.org/wiki/Algorithms/Distance_approximations
     */
    public final double _distance(final TspPoint to) {
        final double dx = this.x-to.x;
        final double dy = this.y-to.y;
        return (dx*dx)+(dy*dy);
    }
}
