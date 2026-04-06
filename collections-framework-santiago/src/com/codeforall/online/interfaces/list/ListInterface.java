package com.codeforall.online.interfaces.list;

public interface ListInterface<T> {

    T get(int index); // return object in given index

    int indexOf(T el); // return the index of given element

    T[] subList(int fromIndex, int toIndex); // returns list of objects represented from the given index to the ending index

}
