package io.github.xlair;

/**
 * This class is holding overlap items. <br>
 * `Pair(o1, o2)` and `Pair(o2, o1)` are same. <br>
 * 
 * @param <T> target type
 */
public class Pair<T> {

    /**
     * overlap item
     */
    private T o1;

    /**
     * overlap item
     */
    private T o2;

    /**
     * Constructor
     * 
     * @param o1 overlap instance
     * @param o2 overlap instance
     */
    public Pair(T o1, T o2) {
        super();
        this.o1 = o1;
        this.o2 = o2;
    }

    /**
     * return the o1
     * 
     * @return o1
     */
    public T getO1() {
        return o1;
    }

    /**
     * return the o2
     * 
     * @return o2
     */
    public T getO2() {
        return o2;
    }
}
