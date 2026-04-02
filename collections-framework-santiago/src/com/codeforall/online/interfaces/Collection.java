package com.codeforall.online.interfaces;

public interface Collection {

    int size(); // collection size

    boolean add(Object el); // add element to the collection

    boolean remove(Object el); // remove element from the collection

    boolean contains(Object el); // check if the collection has object element

    boolean isEmpty(); // check if the collection it's been called upon is empty

    void clear(); // clear the collection

}
