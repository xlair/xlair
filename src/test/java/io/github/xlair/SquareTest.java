package io.github.xlair;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

    @Test
    public void test01() {
        long x = 100L;
        long y = 200L;
        long width = 400L;
        long height = 300L;
        Square square1 = new Square.Builder(x, y).width(width).height(height).build();

        assertEquals(x, square1.getX());
        assertEquals(y, square1.getY());
        assertEquals(width, square1.getWidth());
        assertEquals(height, square1.getHeight());
        Line xLine = square1.getXLine();
        assertEquals(width, xLine.getLength());
        assertEquals(x, xLine.getPoint1());
        assertEquals(x + width, xLine.getPoint2());
        Line yLine = square1.getYLine();
        assertEquals(height, yLine.getLength());
        assertEquals(y, yLine.getPoint1());
        assertEquals(y + height, yLine.getPoint2());
    }

    @Test
    public void test02() {
        long x = 100L;
        long y = 200L;
        long width = 400L;
        long height = 300L;
        Square square2 = new Square(x, y, width, height);

        assertEquals(x, square2.getX());
        assertEquals(y, square2.getY());
        assertEquals(width, square2.getWidth());
        assertEquals(height, square2.getHeight());
        Line xLine = square2.getXLine();
        assertEquals(width, xLine.getLength());
        assertEquals(x, xLine.getPoint1());
        assertEquals(x + width, xLine.getPoint2());
        Line yLine = square2.getYLine();
        assertEquals(height, yLine.getLength());
        assertEquals(y, yLine.getPoint1());
        assertEquals(y + height, yLine.getPoint2());
    }
    
}
