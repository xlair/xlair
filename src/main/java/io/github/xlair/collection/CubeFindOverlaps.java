package io.github.xlair.collection;

import io.github.xlair.Cube;
import io.github.xlair.Xlair;

/**
 * Cube find overlap class. <br>
 * 
 * @see AbstractFindOverlaps
 */
public class CubeFindOverlaps extends AbstractFindOverlaps<Cube> {

    @Override
    protected boolean isOverlap(Cube o1, Cube o2) {
        return Xlair.isOverlap(o1, o2);
    }

    @Override
    protected boolean isOverlapOrContact(Cube o1, Cube o2) {
        return Xlair.isOverlapOrContact(o1, o2);
    }

}
