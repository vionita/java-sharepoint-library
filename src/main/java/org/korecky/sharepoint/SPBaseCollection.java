package org.korecky.sharepoint;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vkorecky
 */
public class SPBaseCollection<T> {

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
}
