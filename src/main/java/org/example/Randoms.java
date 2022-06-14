package org.example;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;


    public Randoms(int min, int max) {
        random = new Random();
        this.max=max;
        this.min=min;
        }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(min, max);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }

    //...
}
