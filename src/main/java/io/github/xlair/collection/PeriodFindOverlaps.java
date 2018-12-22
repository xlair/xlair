package io.github.xlair.collection;

import io.github.xlair.Period;
import io.github.xlair.Xlair;

/**
 * Period find overlap class. <br>
 * 
 * @see AbstractFindOverlaps
 */
public class PeriodFindOverlaps extends AbstractFindOverlaps<Period> {

    @Override
    protected boolean isOverlap(Period o1, Period o2) {
        return Xlair.isOverlap(o1, o2);
    }

    @Override
    protected boolean isOverlapOrContact(Period o1, Period o2) {
        return Xlair.isOverlapOrContact(o1, o2);
    }

}
