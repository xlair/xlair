package io.github.xlair;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.Test;

public class D4Test {

    @Test
    public void test() {
        long x = 0L;
        long y = 0L;
        long z = 0L;
        long width = -200L;
        long height = -100L;
        long depth = -50L;
        Cube cube = new Cube(x, y, z, width, height, depth);

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 1, 1, 1, 1).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 5, 5, 55, 55).toInstant(ZoneOffset.ofHours(9)));
        Period period = new Period(time1, time2);

        D4 d4 = new D4(cube, period);

        assertEquals(cube, d4.getCube());
        assertEquals(period, d4.getPeriod());
    }

}
