package io.github.xlair;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.Test;

public class PeriodTest {

    @Test
    public void test01() {
        Date time1 = Date.from(LocalDateTime.of(2018, 12, 1, 1, 1, 1).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 5, 5, 55, 55).toInstant(ZoneOffset.ofHours(9)));
        long point1 = time1.getTime();
        long point2 = time2.getTime();
        long length = point2 - point1;
        Period period = new Period(time1, time2);

        assertEquals(time1, period.getTime1());
        assertEquals(time2, period.getTime2());
        assertEquals(point1, period.getPoint1());
        assertEquals(point2, period.getPoint2());
        assertEquals(length, period.getLength());
    }

    @Test
    public void test02() {
        Date time = new Date();
        long interval = -1000L;
        Period period = new Period(time, interval);

        assertEquals(time.getTime(), period.getPoint1());
        assertEquals(time.getTime() + interval, period.getPoint2());
        assertEquals(interval, period.getLength());
        assertEquals(time, period.getTime1());
        assertNull(period.getTime2());
    }
}
