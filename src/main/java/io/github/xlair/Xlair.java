package io.github.xlair;

import java.util.List;

import io.github.xlair.collection.AbstractFindOverlaps;
import io.github.xlair.collection.CubeFindOverlaps;
import io.github.xlair.collection.D4FindOverlaps;
import io.github.xlair.collection.LineFindOverlaps;
import io.github.xlair.collection.PeriodFindOverlaps;
import io.github.xlair.collection.SquareFindOverlaps;

/**
 * Determine whether object1 and object2 overlap. <br>
 * Object is four-dimensional data. <br>
 * The following data are supported. <br>
 * <ul>
 * <li>Period to Period : temporal distance overlap</li>
 * <li>Line to Line : one-dimension distance overlap</li>
 * <li>Square to Square : two-dimension distance overlap</li>
 * <li>Cube to Cube : three-dimension distance overlap</li>
 * <li>D4 to D4 : four-dimension distance overlap</li>
 * </ul>
 */
public class Xlair {

    /**
     * create LineFindOverlaps instance for static access
     */
    private static final LineFindOverlaps LINE_FIND_OVERLAPS = new LineFindOverlaps();

    /**
     * create LineFindOverlaps instance for static access
     */
    private static final SquareFindOverlaps SQUARE_FIND_OVERLAPS = new SquareFindOverlaps();

    /**
     * create CubeFindOverlaps instance for static access
     */
    private static final CubeFindOverlaps CUBE_FIND_OVERLAPS = new CubeFindOverlaps();

    /**
     * create D4FindOverlaps instance for static access
     */
    private static final D4FindOverlaps D4_FIND_OVERLAPS = new D4FindOverlaps();

    /**
     * create PeriodFindOverlaps instance for static access
     */
    private static final PeriodFindOverlaps PERIOD_FIND_OVERLAPS = new PeriodFindOverlaps();

    /**
     * Determine whether disntance1 and disntance2 overlap. <br>
     * If disntance1 and disntance2 are overlapped, return true. <br>
     * If disntance1 and disntance2 are contacted, return true. <br>
     * Otherwise it returns false.
     * 
     * @param s1 start value of disntance1
     * @param e1 end value of disntance1
     * @param s2 start value of disntance2
     * @param e2 end value of disntance2
     * @return result
     */
    public static boolean isOverlapOrContact(long s1, long e1, long s2, long e2) {
        return !((Math.min(s2, e2) > Math.max(s1, e1)) || (Math.max(s2, e2) < Math.min(s1, e1)));
    }

    /**
     * Determine whether disntance1 and disntance2 overlap. <br>
     * If disntance1 and disntance2 are overlapped, return true. <br>
     * If disntance1 and disntance2 are contacted, return false. <br>
     * Otherwise it returns false.
     * 
     * @param s1 start value of disntance1
     * @param e1 end value of disntance1
     * @param s2 start value of disntance2
     * @param e2 end value of disntance2
     * @return result
     */
    public static boolean isOverlap(long s1, long e1, long s2, long e2) {
        return !((Math.min(s2, e2) >= Math.max(s1, e1)) || (Math.max(s2, e2) <= Math.min(s1, e1)));
    }

    /**
     * Determine whether line1 and line2 overlap. <br>
     * If line1 and line2 are overlapped, return true. <br>
     * If line1 and line2 are contacted, return true. <br>
     * Otherwise it returns false.
     * 
     * @param line1 target line
     * @param line2 other line
     * @return result
     */
    public static boolean isOverlapOrContact(Line line1, Line line2) {
        return isOverlapOrContact(line1.getPoint1(), line1.getPoint2(), line2.getPoint1(), line2.getPoint2());
    }

    /**
     * Determine whether line1 and line2 overlap. <br>
     * If line1 and line2 are overlapped, return true. <br>
     * If line1 and line2 are contacted, return false. <br>
     * Otherwise it returns false.
     * 
     * @param line1 target line
     * @param line2 other line
     * @return result
     */
    public static boolean isOverlap(Line line1, Line line2) {
        return isOverlap(line1.getPoint1(), line1.getPoint2(), line2.getPoint1(), line2.getPoint2());
    }

    /**
     * Determine whether period1 and period2 overlap. <br>
     * If period1 and period2 are overlapped, return true. <br>
     * If period1 and period2 are contacted, return true. <br>
     * Otherwise it returns false.
     * 
     * @param period1 target period
     * @param period2 other period
     * @return result
     */
    public static boolean isOverlapOrContact(Period period1, Period period2) {
        return isOverlapOrContact(period1.getPoint1(), period1.getPoint2(), period2.getPoint1(), period2.getPoint2());
    }

    /**
     * Determine whether period1 and period2 overlap. <br>
     * If period1 and period2 are overlapped, return true. <br>
     * If period1 and period2 are contacted, return false. <br>
     * Otherwise it returns false.
     * 
     * @param period1 target period
     * @param period2 other period
     * @return result
     */
    public static boolean isOverlap(Period period1, Period period2) {
        return isOverlap(period1.getPoint1(), period1.getPoint2(), period2.getPoint1(), period2.getPoint2());
    }

    /**
     * Determine whether square1 and square2 overlap. <br>
     * If square1 and square2 are overlapped, return true. <br>
     * If square1 and square2 are contacted, return true. <br>
     * Otherwise it returns false.
     * 
     * @param square1 target square
     * @param square2 other square
     * @return result
     */
    public static boolean isOverlapOrContact(Square square1, Square square2) {
        return isOverlapOrContact(square1.getXLine(), square2.getXLine())
                && isOverlapOrContact(square1.getYLine(), square2.getYLine());
    }

    /**
     * Determine whether square1 and square2 overlap. <br>
     * If square1 and square2 are overlapped, return true. <br>
     * If square1 and square2 are contacted, return false. <br>
     * Otherwise it returns false.
     * 
     * @param square1 target square
     * @param square2 other square
     * @return result
     */
    public static boolean isOverlap(Square square1, Square square2) {
        return isOverlap(square1.getXLine(), square2.getXLine()) && isOverlap(square1.getYLine(), square2.getYLine());
    }

    /**
     * Determine whether cube1 and cube2 overlap. <br>
     * If cube1 and cube2 are overlapped, return true. <br>
     * If cube1 and cube2 are contacted, return true. <br>
     * Otherwise it returns false.
     * 
     * @param cube1 target cube
     * @param cube2 other cube
     * @return result
     */
    public static boolean isOverlapOrContact(Cube cube1, Cube cube2) {
        return isOverlapOrContact(cube1.getZLine(), cube2.getZLine())
                && isOverlapOrContact(cube1.getYLine(), cube2.getYLine())
                && isOverlapOrContact(cube1.getXLine(), cube2.getXLine());
    }

    /**
     * Determine whether cube1 and cube2 overlap. <br>
     * If cube1 and cube2 are overlapped, return true. <br>
     * If cube1 and cube2 are contacted, return false. <br>
     * Otherwise it returns false.
     * 
     * @param cube1 target cube
     * @param cube2 other cube
     * @return result
     */
    public static boolean isOverlap(Cube cube1, Cube cube2) {
        return isOverlap(cube1.getZLine(), cube2.getZLine()) && isOverlap(cube1.getYLine(), cube2.getYLine())
                && isOverlap(cube1.getXLine(), cube2.getXLine());
    }

    /**
     * Determine whether d1 and d2 overlap. <br>
     * If d1 and d2 are overlapped, return true. <br>
     * If d1 and d2 are contacted, return true. <br>
     * Otherwise it returns false.
     * 
     * @param d1 target D4 instance
     * @param d2 other D4 instance
     * @return result
     */
    public static boolean isOverlapOrContact(D4 d1, D4 d2) {
        return isOverlapOrContact(d1.getPeriod(), d2.getPeriod())
                && isOverlapOrContact(d1.getCube().getZLine(), d2.getCube().getZLine())
                && isOverlapOrContact(d1.getCube().getYLine(), d2.getCube().getYLine())
                && isOverlapOrContact(d1.getCube().getXLine(), d2.getCube().getXLine());
    }

    /**
     * Determine whether d1 and d2 overlap. <br>
     * If d1 and d2 are overlapped, return true. <br>
     * If d1 and d2 are contacted, return false. <br>
     * Otherwise it returns false.
     * 
     * @param d1 target D4 instance
     * @param d2 other D4 instance
     * @return result
     */
    public static boolean isOverlap(D4 d1, D4 d2) {
        return isOverlap(d1.getPeriod(), d2.getPeriod()) && isOverlap(d1.getCube().getZLine(), d2.getCube().getZLine())
                && isOverlap(d1.getCube().getYLine(), d2.getCube().getYLine())
                && isOverlap(d1.getCube().getXLine(), d2.getCube().getXLine());
    }

    /**
     * Find items that overlap from the collection.<br>
     *
     * @see AbstractFindOverlaps#findOverlaps(List)
     *
     * @param periods Period list for you find overlap item
     * @return result
     */
    public static List<Pair<Period>> findPeriodOverlaps(List<Period> periods) {
        return PERIOD_FIND_OVERLAPS.findOverlaps(periods);
    }

    /**
     * Find items that overlap from the collection.<br>
     *
     * @see AbstractFindOverlaps#findOverlapsOrContacts(List)
     *
     * @param periods Period list for you find overlap item
     * @return result
     */
    public static List<Pair<Period>> findPeriodOverlapsOrContacts(List<Period> periods) {
        return PERIOD_FIND_OVERLAPS.findOverlapsOrContacts(periods);
    }

    /**
     * Find items that overlap from the collection.<br>
     *
     * @see AbstractFindOverlaps#findOverlaps(List)
     *
     * @param lines Line list for you find overlap item
     * @return result
     */
    public static List<Pair<Line>> findLineOverlaps(List<Line> lines) {
        return LINE_FIND_OVERLAPS.findOverlaps(lines);
    }

    /**
     * Find items that overlap from the collection.<br>
     *
     * @see AbstractFindOverlaps#findOverlapsOrContacts(List)
     *
     * @param lines Line list for you find overlap item
     * @return result
     */
    public static List<Pair<Line>> findLineOverlapsOrContacts(List<Line> lines) {
        return LINE_FIND_OVERLAPS.findOverlapsOrContacts(lines);
    }

    /**
     * Find items that overlap from the collection.<br>
     *
     * @see AbstractFindOverlaps#findOverlaps(List)
     *
     * @param squares Square list for you find overlap item
     * @return result
     */
    public static List<Pair<Square>> findSquareOverlaps(List<Square> squares) {
        return SQUARE_FIND_OVERLAPS.findOverlaps(squares);
    }

    /**
     * Find items that overlap from the collection.<br>
     *
     * @see AbstractFindOverlaps#findOverlapsOrContacts(List)
     *
     * @param squares Square list for you find overlap item
     * @return result
     */
    public static List<Pair<Square>> findSquareOverlapsOrContacts(List<Square> squares) {
        return SQUARE_FIND_OVERLAPS.findOverlapsOrContacts(squares);
    }

    /**
     * Find items that overlap from the collection.<br>
     *
     * @see AbstractFindOverlaps#findOverlaps(List)
     *
     * @param cubes Cube list for you find overlap item
     * @return result
     */
    public static List<Pair<Cube>> findCubeOverlaps(List<Cube> cubes) {
        return CUBE_FIND_OVERLAPS.findOverlaps(cubes);
    }

    /**
     * Find items that overlap from the collection.<br>
     *
     * @see AbstractFindOverlaps#findOverlapsOrContacts(List)
     *
     * @param cubes Cube list for you find overlap item
     * @return result
     */
    public static List<Pair<Cube>> findCubeOverlapsOrContacts(List<Cube> cubes) {
        return CUBE_FIND_OVERLAPS.findOverlapsOrContacts(cubes);
    }

    /**
     * Find items that overlap from the collection.<br>
     *
     * @see AbstractFindOverlaps#findOverlaps(List)
     *
     * @param d4s D4 list for you find overlap item
     * @return result
     */
    public static List<Pair<D4>> findD4Overlaps(List<D4> d4s) {
        return D4_FIND_OVERLAPS.findOverlaps(d4s);
    }

    /**
     * Find items that overlap from the collection.<br>
     *
     * @see AbstractFindOverlaps#findOverlapsOrContacts(List)
     *
     * @param d4s D4 list for you find overlap item
     * @return result
     */
    public static List<Pair<D4>> findD4OverlapsOrContacts(List<D4> d4s) {
        return D4_FIND_OVERLAPS.findOverlapsOrContacts(d4s);
    }
}
