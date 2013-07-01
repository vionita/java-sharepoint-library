package org.korecky.sharepoint;

import java.util.ArrayList;
import java.util.List;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVisitor;

/**
 *
 * @author vkorecky
 */
public class SPBaseCollection<T>{

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
    
    public T get(int i){
        return items.get(i);
    }    
}
