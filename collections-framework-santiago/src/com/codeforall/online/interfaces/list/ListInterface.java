package com.codeforall.online.interfaces.list;

public interface ListInterface {

    Object get(int index); // return object in given index

    int indexOf(Object el); // return the index of given element

    Object[] subList(int fromIndex, int toIndex); // returns list of objects represented from the given index to the ending index

}
