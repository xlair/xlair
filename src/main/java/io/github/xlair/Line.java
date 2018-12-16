package io.github.xlair;

/**
 * Model class for holding one-dimensional data. <br>
 * One-dimension is anything ok. For example x-axis or y-axis or z-axis. <br>
 * Since it is calculated by relative value, any unit may be used. <br>
 * The length may be positive or negative. <br>
 * Length is distance from point1. <br>
 * point1 ---(length)--- point2 <br>
 */
public class Line {

    /**
     * base point.
     */
    private long point1;

    /**
     * other point.
     */
    private long point2;

    /**
     * distance from point1 to point2.
     */
    private long length;

    /**
     * Constructor
     * 
     * @param point  base point. this value set to point1.
     * @param length distance from point1 to point2
     */
    public Line(long point, long length) {
        super();
        this.point1 = point;
        this.length = length;
        this.point2 = point + length;
    }

    /**
     * return the point1
     * 
     * @return point1
     */
    public long getPoint1() {
        return point1;
    }

    /**
     * return the point2
     * 
     * @return point2
     */
    public long getPoint2() {
        return point2;
    }

    /**
     * return the length
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }
}
