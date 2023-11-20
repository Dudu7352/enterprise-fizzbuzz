package org.example;

import java.util.Iterator;

public class NumberRange implements Iterator<Integer>, Iterable<Integer>, Cloneable {
    private final int last, step;
    private int iter;

    public NumberRange(int first, int last, int step) throws IllegalArgumentException {
        if(first == last || step == 0 || (last - first) * step < 0) {
            throw new IllegalArgumentException("Incorrect number range");
        }
        this.last = last;
        this.step = step;
        this.iter = first;
    }

    @Override
    public boolean hasNext() {
        return iter < last * Integer.signum(step);
    }

    @Override
    public Integer next() {
        iter += step;
        return iter - step;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }
}
