package io.github.xlair.collection;

import io.github.xlair.Line;
import io.github.xlair.Xlair;

/**
 * Line find overlap class. <br>
 * 
 * @see AbstractFindOverlaps
 */
public class LineFindOverlaps extends AbstractFindOverlaps<Line> {

    @Override
    protected boolean isOverlap(Line o1, Line o2) {
        return Xlair.isOverlap(o1, o2);
    }

    @Override
    protected boolean isOverlapOrContact(Line o1, Line o2) {
        return Xlair.isOverlapOrContact(o1, o2);
    }

}
