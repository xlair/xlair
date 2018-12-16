package io.github.xlair;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineTest {

    @Test
    public void test01() {
        long point = 100L;
        long length = 50L;
        Line line = new Line(point, length);

        assertEquals(point, line.getPoint1());
        assertEquals(length, line.getLength());
        assertEquals(150L, line.getPoint2());
    }

    @Test
    public void test02() {
        long point = 100L;
        long length = -50L;
        Line line = new Line(point, length);

        assertEquals(point, line.getPoint1());
        assertEquals(length, line.getLength());
        assertEquals(50L, line.getPoint2());
    }
    
}
