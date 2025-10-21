package org.example.iterator;

import java.util.Iterator;

public class MyCollection<T> implements Iterable{
    private T[] elements;
    private int last;
    private int size;
    public MyCollection(int size) {//10
        this.elements = (T[]) new Object[size];
        this.last = 0;
        this.size = size;
    }
    public void add(T element) {
        if (last == size) {
            elements = (T[]) new Object[size * 2];
        }
        elements[last++] = element;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator{
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < last;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return elements[index++];
            }
            return null;
        }
    }
}
