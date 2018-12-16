package io.github.xlair;

/**
 * Model class for holding two-dimensional data. <br>
 * Two-dimension is anything ok. For example x-y-axis or y-z-axis or x-z-axis.
 * <br>
 * But use x, y as display in this model. <br>
 * Since it is calculated by relative value, any unit may be used. <br>
 * width, height may be positive or negative. <br>
 * 
 * <pre>
 *    +-----------------+
 *    |                 |
 * (height)             |
 *    |                 |
 * (x, y) ---(width)--- +
 * </pre>
 */
public class Square {

    /**
     * base point at x-axis.
     */
    private long x;

    /**
     * base point at y-axis.
     */
    private long y;

    /**
     * distance from x to other point. <br>
     * this value is used at x-axis. <br>
     */
    private long width;

    /**
     * distance from y to other point. <br>
     * this value is used at y-axis. <br>
     */
    private long height;

    /**
     * Line instance of x-axis
     */
    private Line xLine;

    /**
     * Line instance of y-axis
     */
    private Line yLine;

    /**
     * Constructor
     * 
     * @param x      base point. this value set to x.
     * @param y      base point. this value set to y.
     * @param width  distance from x to other point.
     * @param height distance from y to other point.
     */
    public Square(long x, long y, long width, long height) {
        super();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.xLine = new Line(x, width);
        this.yLine = new Line(y, height);
    }

    /**
     * return the xLine
     * 
     * @return xLine
     */
    public Line getXLine() {
        return xLine;
    }

    /**
     * return the yLine
     * 
     * @return yLine
     */
    public Line getYLine() {
        return yLine;
    }

    /**
     * return the x
     * 
     * @return x
     */
    public long getX() {
        return x;
    }

    /**
     * return the y
     * 
     * @return y
     */
    public long getY() {
        return y;
    }

    /**
     * return the width
     * 
     * @return width
     */
    public long getWidth() {
        return width;
    }

    /**
     * return the height
     * 
     * @return height
     */
    public long getHeight() {
        return height;
    }

    /**
     * Square builder
     */
    static class Builder {
        /**
         * base point at x-axis.
         */
        private long x;

        /**
         * base point at y-axis.
         */
        private long y;

        /**
         * distance from x to other point. <br>
         * this value is used at x-axis. <br>
         */
        private long width;

        /**
         * distance from y to other point. <br>
         * this value is used at y-axis. <br>
         */
        private long height;

        /**
         * Constructor
         * 
         * @param x base point. this value set to x.
         * @param y base point. this value set to y.
         */
        Builder(long x, long y) {
            this.x = x;
            this.y = y;
        }

        /**
         * set to width
         * 
         * @param width distance from x to other point.
         * @return Builder
         */
        Builder width(long width) {
            this.width = width;
            return this;
        }

        /**
         * set to height
         * 
         * @param height distance from y to other point.
         * @return Builder
         */
        Builder height(long height) {
            this.height = height;
            return this;
        }

        /**
         * Build the Square instance.
         * 
         * @return Square
         */
        Square build() {
            return new Square(x, y, width, height);
        }
    }
}
