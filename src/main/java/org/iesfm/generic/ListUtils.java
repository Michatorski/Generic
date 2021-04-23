package org.iesfm.generic;

import java.util.List;

public class ListUtils<T>{

    private List<T> values;

    public ListUtils(List<T> values) {
        this.values = values;
    }

    public T getFirstPosotion(){

        return values.get(0);
    }

    public T getLastPosition(){
        return values.get( values.size() -1);
    }

    public void insterT(T value){

       values.add(value);
    }
}
