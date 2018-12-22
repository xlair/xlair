package io.github.xlair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairSquareCollectionTest extends XlairTestBase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // warming up
        Xlair.findSquareOverlaps(null);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        showAverage("findSquareOverlaps, findSquareOverlapsOrContacts");
    }

    @Test
    public void testFindSquaresOverlaps01() {
        List<Pair<Square>> pairs = findSquaresOverlapsWrapper(null);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindSquaresOverlaps02() {
        List<Square> squares = new ArrayList<>();

        List<Pair<Square>> pairs = findSquaresOverlapsWrapper(squares);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindSquaresOverlaps03() {
        List<Square> squares = new ArrayList<>();
        Square s1 = new Square.Builder(0L, 0L).width(40L).height(40L).build();
        squares.add(s1);
        Square s2 = new Square.Builder(50L, 0L).width(40L).height(40L).build();
        squares.add(s2);
        Square s3 = new Square.Builder(0L, 50L).width(40L).height(40L).build();
        squares.add(s3);
        Square s4 = new Square.Builder(50L, 50L).width(40L).height(40L).build();
        squares.add(s4);

        List<Pair<Square>> pairs = findSquaresOverlapsWrapper(squares);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindSquaresOverlaps04() {
        List<Square> squares = new ArrayList<>();
        Square s1 = new Square.Builder(0L, 0L).width(40L).height(40L).build();
        squares.add(s1);
        Square s2 = new Square.Builder(50L, 0L).width(40L).height(40L).build();
        squares.add(s2);
        Square s3 = new Square.Builder(0L, 50L).width(40L).height(40L).build();
        squares.add(s3);
        Square s4 = new Square.Builder(50L, 50L).width(40L).height(40L).build();
        squares.add(s4);
        Square s5 = new Square.Builder(25L, 25L).width(40L).height(40L).build();
        squares.add(s5);

        List<Pair<Square>> pairs = findSquaresOverlapsWrapper(squares);

        assertNotNull(pairs);
        assertEquals(4, pairs.size());
        Pair<Square> pair1 = pairs.get(0);
        assertEquals(s1, pair1.getO1());
        assertEquals(s5, pair1.getO2());
        Pair<Square> pair2 = pairs.get(1);
        assertEquals(s2, pair2.getO1());
        assertEquals(s5, pair2.getO2());
        Pair<Square> pair3 = pairs.get(2);
        assertEquals(s3, pair3.getO1());
        assertEquals(s5, pair3.getO2());
        Pair<Square> pair4 = pairs.get(3);
        assertEquals(s4, pair4.getO1());
        assertEquals(s5, pair4.getO2());
    }

    @Test
    public void testFindSquaresOverlaps05() {
        List<Square> squares = new ArrayList<>();
        Square s1 = new Square.Builder(0L, 0L).width(50L).height(50L).build();
        squares.add(s1);
        Square s2 = new Square.Builder(50L, 0L).width(50L).height(50L).build();
        squares.add(s2);
        Square s3 = new Square.Builder(0L, 50L).width(50L).height(50L).build();
        squares.add(s3);
        Square s4 = new Square.Builder(50L, 50L).width(50L).height(50L).build();
        squares.add(s4);
        Square s5 = new Square.Builder(25L, 25L).width(50L).height(50L).build();
        squares.add(s5);

        List<Pair<Square>> pairs = findSquaresOverlapsWrapper(squares);

        assertNotNull(pairs);
        assertEquals(4, pairs.size());
        Pair<Square> pair1 = pairs.get(0);
        assertEquals(s1, pair1.getO1());
        assertEquals(s5, pair1.getO2());
        Pair<Square> pair2 = pairs.get(1);
        assertEquals(s2, pair2.getO1());
        assertEquals(s5, pair2.getO2());
        Pair<Square> pair3 = pairs.get(2);
        assertEquals(s3, pair3.getO1());
        assertEquals(s5, pair3.getO2());
        Pair<Square> pair4 = pairs.get(3);
        assertEquals(s4, pair4.getO1());
        assertEquals(s5, pair4.getO2());
    }

    @Test
    public void testFindSquaresOverlaps06() {
        List<Square> squares = new ArrayList<>();
        Square s1 = new Square.Builder(0L, 0L).width(50L).height(50L).build();
        squares.add(s1);
        Square s2 = new Square.Builder(0L, 0L).width(50L).height(50L).build();
        squares.add(s2);
        Square s3 = new Square.Builder(0L, 00L).width(50L).height(50L).build();
        squares.add(s3);

        List<Pair<Square>> pairs = findSquaresOverlapsWrapper(squares);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<Square> pair1 = pairs.get(0);
        assertEquals(s1, pair1.getO1());
        assertEquals(s2, pair1.getO2());
        Pair<Square> pair2 = pairs.get(1);
        assertEquals(s1, pair2.getO1());
        assertEquals(s3, pair2.getO2());
        Pair<Square> pair3 = pairs.get(2);
        assertEquals(s2, pair3.getO1());
        assertEquals(s3, pair3.getO2());
    }

    @Test
    public void testFindSquaresOverlapsOrContacts01() {
        List<Pair<Square>> pairs = findSquaresOverlapsOrContactsWrapper(null);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindSquaresOverlapsOrContacts02() {
        List<Square> squares = new ArrayList<>();

        List<Pair<Square>> pairs = findSquaresOverlapsOrContactsWrapper(squares);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindSquaresOverlapsOrContacts03() {
        List<Square> squares = new ArrayList<>();
        Square s1 = new Square.Builder(0L, 0L).width(40L).height(40L).build();
        squares.add(s1);
        Square s2 = new Square.Builder(50L, 0L).width(40L).height(40L).build();
        squares.add(s2);
        Square s3 = new Square.Builder(0L, 50L).width(40L).height(40L).build();
        squares.add(s3);
        Square s4 = new Square.Builder(50L, 50L).width(40L).height(40L).build();
        squares.add(s4);

        List<Pair<Square>> pairs = findSquaresOverlapsOrContactsWrapper(squares);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindSquaresOverlapsOrContacts04() {
        List<Square> squares = new ArrayList<>();
        Square s1 = new Square.Builder(0L, 0L).width(40L).height(40L).build();
        squares.add(s1);
        Square s2 = new Square.Builder(50L, 0L).width(40L).height(40L).build();
        squares.add(s2);
        Square s3 = new Square.Builder(0L, 50L).width(40L).height(40L).build();
        squares.add(s3);
        Square s4 = new Square.Builder(50L, 50L).width(40L).height(40L).build();
        squares.add(s4);
        Square s5 = new Square.Builder(25L, 25L).width(40L).height(40L).build();
        squares.add(s5);

        List<Pair<Square>> pairs = findSquaresOverlapsOrContactsWrapper(squares);

        assertNotNull(pairs);
        assertEquals(4, pairs.size());
        Pair<Square> pair1 = pairs.get(0);
        assertEquals(s1, pair1.getO1());
        assertEquals(s5, pair1.getO2());
        Pair<Square> pair2 = pairs.get(1);
        assertEquals(s2, pair2.getO1());
        assertEquals(s5, pair2.getO2());
        Pair<Square> pair3 = pairs.get(2);
        assertEquals(s3, pair3.getO1());
        assertEquals(s5, pair3.getO2());
        Pair<Square> pair4 = pairs.get(3);
        assertEquals(s4, pair4.getO1());
        assertEquals(s5, pair4.getO2());
    }

    @Test
    public void testFindSquaresOverlapsOrContacts05() {
        List<Square> squares = new ArrayList<>();
        Square s1 = new Square.Builder(0L, 0L).width(50L).height(50L).build();
        squares.add(s1);
        Square s2 = new Square.Builder(50L, 0L).width(50L).height(50L).build();
        squares.add(s2);
        Square s3 = new Square.Builder(0L, 50L).width(50L).height(50L).build();
        squares.add(s3);
        Square s4 = new Square.Builder(50L, 50L).width(50L).height(50L).build();
        squares.add(s4);
        Square s5 = new Square.Builder(25L, 25L).width(50L).height(50L).build();
        squares.add(s5);

        List<Pair<Square>> pairs = findSquaresOverlapsOrContactsWrapper(squares);

        assertNotNull(pairs);
        assertEquals(10, pairs.size());
        Pair<Square> pair1 = pairs.get(0);
        assertEquals(s1, pair1.getO1());
        assertEquals(s2, pair1.getO2());
        Pair<Square> pair2 = pairs.get(1);
        assertEquals(s1, pair2.getO1());
        assertEquals(s3, pair2.getO2());
        Pair<Square> pair3 = pairs.get(2);
        assertEquals(s1, pair3.getO1());
        assertEquals(s4, pair3.getO2());
        Pair<Square> pair4 = pairs.get(3);
        assertEquals(s1, pair4.getO1());
        assertEquals(s5, pair4.getO2());
        Pair<Square> pair5 = pairs.get(4);
        assertEquals(s2, pair5.getO1());
        assertEquals(s3, pair5.getO2());
        Pair<Square> pair6 = pairs.get(5);
        assertEquals(s2, pair6.getO1());
        assertEquals(s4, pair6.getO2());
        Pair<Square> pair7 = pairs.get(6);
        assertEquals(s2, pair7.getO1());
        assertEquals(s5, pair7.getO2());
        Pair<Square> pair8 = pairs.get(7);
        assertEquals(s3, pair8.getO1());
        assertEquals(s4, pair8.getO2());
        Pair<Square> pair9 = pairs.get(8);
        assertEquals(s3, pair9.getO1());
        assertEquals(s5, pair9.getO2());
        Pair<Square> pair10 = pairs.get(9);
        assertEquals(s4, pair10.getO1());
        assertEquals(s5, pair10.getO2());
    }

    @Test
    public void testFindSquaresOverlapsOrContacts06() {
        List<Square> squares = new ArrayList<>();
        Square s1 = new Square.Builder(0L, 0L).width(50L).height(50L).build();
        squares.add(s1);
        Square s2 = new Square.Builder(0L, 0L).width(50L).height(50L).build();
        squares.add(s2);
        Square s3 = new Square.Builder(0L, 00L).width(50L).height(50L).build();
        squares.add(s3);

        List<Pair<Square>> pairs = findSquaresOverlapsOrContactsWrapper(squares);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<Square> pair1 = pairs.get(0);
        assertEquals(s1, pair1.getO1());
        assertEquals(s2, pair1.getO2());
        Pair<Square> pair2 = pairs.get(1);
        assertEquals(s1, pair2.getO1());
        assertEquals(s3, pair2.getO2());
        Pair<Square> pair3 = pairs.get(2);
        assertEquals(s2, pair3.getO1());
        assertEquals(s3, pair3.getO2());
    }
}
