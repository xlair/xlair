package io.github.xlair;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class XlairTestBase {

    private static List<Long> executedTimes = new ArrayList<>();

    private long start;
    private long end;
    private long elapsed;

    public static void showAverage(String testMethodName) {
        Double reult = executedTimes.stream().collect(Collectors.averagingLong(Long::longValue));
        System.out.println("[AVERAGE] (" + testMethodName + ") : " + reult + " (ns)");
    }

    public Date date(int year, int month, int dayOfMonth, int hour, int minute, int second) {
        return Date
                .from(LocalDateTime.of(year, month, dayOfMonth, hour, minute, second).toInstant(ZoneOffset.ofHours(9)));
    }

    protected List<Pair<Line>> findLineOverlapsWrapper(List<Line> lines) {
        start = System.nanoTime();
        List<Pair<Line>> result = Xlair.findLineOverlaps(lines);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected List<Pair<Line>> findLineOverlapsOrContactsWrapper(List<Line> lines) {
        start = System.nanoTime();
        List<Pair<Line>> result = Xlair.findLineOverlapsOrContacts(lines);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected List<Pair<Period>> findPeriodOverlapsWrapper(List<Period> periods) {
        start = System.nanoTime();
        List<Pair<Period>> result = Xlair.findPeriodOverlaps(periods);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected List<Pair<Period>> findPeriodOverlapsOrContactsWrapper(List<Period> periods) {
        start = System.nanoTime();
        List<Pair<Period>> result = Xlair.findPeriodOverlapsOrContacts(periods);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected List<Pair<Square>> findSquaresOverlapsWrapper(List<Square> squares) {
        start = System.nanoTime();
        List<Pair<Square>> result = Xlair.findSquareOverlaps(squares);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected List<Pair<Square>> findSquaresOverlapsOrContactsWrapper(List<Square> squares) {
        start = System.nanoTime();
        List<Pair<Square>> result = Xlair.findSquareOverlapsOrContacts(squares);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected List<Pair<Cube>> findCubeOverlapsWrapper(List<Cube> cubes) {
        start = System.nanoTime();
        List<Pair<Cube>> result = Xlair.findCubeOverlaps(cubes);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected List<Pair<Cube>> findCubeOverlapsOrContactsWrapper(List<Cube> cubes) {
        start = System.nanoTime();
        List<Pair<Cube>> result = Xlair.findCubeOverlapsOrContacts(cubes);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected List<Pair<D4>> findD4OverlapsWrapper(List<D4> d4s) {
        start = System.nanoTime();
        List<Pair<D4>> result = Xlair.findD4Overlaps(d4s);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected List<Pair<D4>> findD4OverlapsOrContactsWrapper(List<D4> d4s) {
        start = System.nanoTime();
        List<Pair<D4>> result = Xlair.findD4OverlapsOrContacts(d4s);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected boolean isOverlapWrapper(Cube c1, Cube c2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlap(c1, c2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected boolean isOverlapOrContactWrapper(Cube c1, Cube c2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlapOrContact(c1, c2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected boolean isOverlapWrapper(D4 d1, D4 d2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlap(d1, d2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected boolean isOverlapOrContactWrapper(D4 d1, D4 d2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlapOrContact(d1, d2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected boolean isOverlapWrapper(Line l1, Line l2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlap(l1, l2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected boolean isOverlapOrContactWrapper(Line l1, Line l2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlapOrContact(l1, l2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected boolean isOverlapWrapper(Square s1, Square s2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlap(s1, s2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected boolean isOverlapOrContactWrapper(Square s1, Square s2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlapOrContact(s1, s2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected boolean isOverlapOrContactWrapper(Period t1, Period t2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlapOrContact(t1, t2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }

    protected boolean isOverlapWrapper(Period t1, Period t2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlap(t1, t2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        return result;
    }
}
