package io.github.xlair;

/**
 * Model class for holding three-dimensional data. <br>
 * Since it is calculated by relative value, any unit may be used. <br>
 * width, height, depth may be positive or negative. <br>
 * Use width as x-axis display in this model. <br>
 * Use heigth as y-axis display in this model. <br>
 * Use depth as z-axis display in this model. <br>
 *
 * <pre>
 *        +--------------------+
 *       /                    /|
 *   (depth)                 / |
 *     /                    /  |
 *    +--------------------+   +
 *    |                    |  /
 * (height)                | /
 *    |                    |/
 * (x, y, z) ---(width)--- +
 * </pre>
 */
public class Cube {

    /**
     * base point at x-axis.
     */
    private long x;

    /**
     * base point at y-axis.
     */
    private long y;

    /**
     * base point at z-axis.
     */
    private long z;

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
     * distance from z to other point. <br>
     * this value is used at z-axis. <br>
     */
    private long depth;

    /**
     * Line instance of x-axis
     */
    private Line xLine;

    /**
     * Line instance of y-axis
     */
    private Line yLine;

    /**
     * Line instance of z-axis
     */
    private Line zLine;

    /**
     * Constructor
     * 
     * @param x      base point. this value set to x.
     * @param y      base point. this value set to y.
     * @param z      base point. this value set to z.
     * @param width  distance from x to other point.
     * @param height distance from y to other point.
     * @param depth  distance from z to other point.
     */
    public Cube(long x, long y, long z, long width, long height, long depth) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.xLine = new Line(x, width);
        this.yLine = new Line(y, height);
        this.zLine = new Line(z, depth);
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
     * return the zLine
     * 
     * @return zLine
     */
    public Line getZLine() {
        return zLine;
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
     * return the z
     * 
     * @return z
     */
    public long getZ() {
        return z;
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
     * return the depth
     * 
     * @return depth
     */
    public long getDepth() {
        return depth;
    }

    /**
     * Cube Builder
     */
    static class Builder {
        private long x;
        private long y;
        private long z;
        private long width;
        private long height;
        private long depth;

        /**
         * Constructor
         * 
         * @param x base point. this value set to x.
         * @param y base point. this value set to y.
         * @param z base point. this value set to z.
         */
        Builder(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        /**
         * set to width
         * 
         * @param width distance from x to other point.
         * @return builder
         */
        public Builder width(long width) {
            this.width = width;
            return this;
        }

        /**
         * set to height
         * 
         * @param height distance from y to other point.
         * @return builder
         */
        public Builder height(long height) {
            this.height = height;
            return this;
        }

        /**
         * set to depth
         * 
         * @param depth distance from z to other point.
         * @return builder
         */
        public Builder depth(long depth) {
            this.depth = depth;
            return this;
        }

        /**
         * Build the Cube instance.
         * 
         * @return cube instance
         */
        public Cube build() {
            return new Cube(x, y, z, width, height, depth);
        }
    }
}
