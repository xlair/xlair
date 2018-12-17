package io.github.xlair;

import java.util.Date;

/**
 * Model class for holding time(term) data. <br>
 * The length may be positive or negative. <br>
 * Length is temporal distance from point1. <br>
 * time1 ---(length)--- time2 <br>
 */
public class Period {

    /**
     * base point.
     */
    private long point1;

    /**
     * other point.
     */
    private long point2;

    /**
     * temporal distance from point1 to point2.
     */
    private long length;

    /**
     * Date instance of point1.
     */
    private Date time1;

    /**
     * Date instance of point2.
     */
    private Date time2;

    /**
     * Constructor
     * 
     * @param start     start time point, this value set to time1.
     * @param interval this value used calculated end time, this value set to
     *                 length.
     */
    public Period(Date start, long interval) {
        super();
        this.time1 = start;
        this.length = interval;
        this.point1 = start.getTime();
        this.point2 = point1 + interval;
    }

    /**
     * Constructor
     * 
     * @param start start time point, this value set to time1.
     * @param end   end time point, this value set to time2.
     */
    public Period(Date start, Date end) {
        super();
        this.time1 = start;
        this.time2 = end;
        this.point1 = start.getTime();
        this.point2 = end.getTime();
        this.length = Math.abs(point1 - point2);
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

    /**
     * return the time1
     * 
     * @return time1
     */
    public Date getTime1() {
        return time1;
    }

    /**
     * return the time2
     * 
     * @return time2
     */
    public Date getTime2() {
        return time2;
    }
}
