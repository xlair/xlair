package io.github.xlair.collection;

import io.github.xlair.Square;
import io.github.xlair.Xlair;

/**
 * Square find overlap class. <br>
 * 
 * @see AbstractFindOverlaps
 */
public class SquareFindOverlaps extends AbstractFindOverlaps<Square> {

    @Override
    protected boolean isOverlap(Square o1, Square o2) {
        return Xlair.isOverlap(o1, o2);
    }

    @Override
    protected boolean isOverlapOrContact(Square o1, Square o2) {
        return Xlair.isOverlapOrContact(o1, o2);
    }
}
