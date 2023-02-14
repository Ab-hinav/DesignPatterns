package org.Designs.Iterator;

import java.util.ArrayList;

public class PancakehouseMenuIterator implements Iterator {

    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakehouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }


}
