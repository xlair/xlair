package io.github.xlair.collection;

import io.github.xlair.D4;
import io.github.xlair.Xlair;

/**
 * D4 find overlap class. <br>
 * 
 * @see AbstractFindOverlaps
 */
public class D4FindOverlaps extends AbstractFindOverlaps<D4> {

    @Override
    protected boolean isOverlap(D4 o1, D4 o2) {
        return Xlair.isOverlap(o1, o2);
    }

    @Override
    protected boolean isOverlapOrContact(D4 o1, D4 o2) {
        return Xlair.isOverlapOrContact(o1, o2);
    }

}
