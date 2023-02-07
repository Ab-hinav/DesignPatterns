package org.Designs.Adapter.HeadFirst;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerationAdapter implements Enumeration<Object> {

    Iterator<Object> iterator;

    public IteratorEnumerationAdapter(Iterator<Object> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

    @Override
    public Iterator<Object> asIterator() {
        return Enumeration.super.asIterator();
    }
}
