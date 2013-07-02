package org.korecky.sharepoint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vkorecky
 */
public abstract class SPBaseCollection<T> implements Iterable<T> {

    protected List<T> items;

    protected SPBaseCollection() {
        items = new ArrayList<T>();
    }

    /**
     * Gets the number of websites that are represented in the collection.
     *
     * @return
     */
    public int getCount() {
        return items.size();
    }

    /**
     * Gets the element at the specified index in the collection.
     *
     * @param index
     * @return
     */
    public T getItem(int index) {
        return items.get(index);
    }

    /**
     * Gets iterator of collection
     *
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}
