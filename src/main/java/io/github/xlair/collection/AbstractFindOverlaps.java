package io.github.xlair.collection;

import java.util.ArrayList;
import java.util.List;

import io.github.xlair.Pair;

/**
 * Find items that overlap from the collection. <br>
 * This is abstract class, so you override isOverlap and findOverlapsOrContacts
 * methods. <br>
 *
 * @param <T> target type
 */
public abstract class AbstractFindOverlaps<T> {

    /**
     * Find items that overlap from the collection. <br>
     * Determine overlap process is isOverlap method. <br>
     * Result list is holding overlapping items. <br>
     * If not contains overlap items, list is empty. <br>
     * 
     * @param items target list
     * @return result
     */
    public List<Pair<T>> findOverlaps(List<T> items) {
        List<Pair<T>> pairs = new ArrayList<>();
        if (items != null) {
            int count = items.size();
            T o1;
            T o2;
            for (int i = 0; i < count; i++) {
                for (int j = i + 1; j < count; j++) {
                    o1 = items.get(i);
                    o2 = items.get(j);
                    if (isOverlap(o1, o2)) {
                        pairs.add(new Pair<T>(o1, o2));
                    }
                }
            }
        }
        return pairs;
    }

    /**
     * Find items that overlap from the collection. <br>
     * Determine overlap process is isOverlapOrContact method. <br>
     * Result list is holding overlapping items. <br>
     * If not contains overlap items, list is empty. <br>
     * 
     * @param items target list
     * @return result
     */
    public List<Pair<T>> findOverlapsOrContacts(List<T> items) {
        List<Pair<T>> pairs = new ArrayList<>();
        if (items != null) {
            int count = items.size();
            T o1;
            T o2;
            for (int i = 0; i < count; i++) {
                for (int j = i + 1; j < count; j++) {
                    o1 = items.get(i);
                    o2 = items.get(j);
                    if (isOverlapOrContact(o1, o2)) {
                        pairs.add(new Pair<T>(o1, o2));
                    }
                }
            }
        }
        return pairs;
    }

    /**
     * Determine whether o1 and o2 overlap. <br>
     * If o1 and o2 are overlapped, return true. <br>
     * If o1 and o2 are contacted, return false. <br>
     * Otherwise it returns false.
     * 
     * @param o1 target instance
     * @param o2 other instance
     * @return result
     */
    protected abstract boolean isOverlap(T o1, T o2);

    /**
     * Determine whether o1 and o2 overlap. <br>
     * If o1 and o2 are overlapped, return true. <br>
     * If o1 and o2 are contacted, return true. <br>
     * Otherwise it returns false.
     * 
     * @param o1 target instance
     * @param o2 other instance
     * @return result
     */
    protected abstract boolean isOverlapOrContact(T o1, T o2);
}
