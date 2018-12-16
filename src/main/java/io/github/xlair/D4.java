package io.github.xlair;

/**
 * Model class for holding four-dimensional data. <br>
 * Four-dimensions are composed of space and time, so contains Cube instance and Period instance. <br>
 * cube instance are x-axis, y-axis, z-axis. <br>
 * period  information is time-axis. <br>
 */
public class D4 {

    /**
     * cube instance. <br>
     * this information are x-axis, y-axis, z-axis.<br>
     */
    private Cube cube;

    /**
     * period instance.
     * this information is time-axis.<br>
     */
    private Period period;

    /**
     * Constructor
     * 
     * @param cube   cube instance
     * @param period period instance
     */
    public D4(Cube cube, Period period) {
        super();
        this.cube = cube;
        this.period = period;
    }

    /**
     * return the cube
     * 
     * @return cube
     */
    public Cube getCube() {
        return cube;
    }

    /**
     * return the period
     * 
     * @return period
     */
    public Period getPeriod() {
        return period;
    }

}
