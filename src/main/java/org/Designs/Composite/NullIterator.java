package org.Designs.Composite;
import java.util.Iterator;

public class NullIterator extends MenuComponent implements Iterator{

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }



}
