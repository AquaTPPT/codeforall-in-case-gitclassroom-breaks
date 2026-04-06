package com.codeforall.online.interfaces;

public interface Collection<T>{

    int size(); // collection size

    boolean add(T el); // add element to the collection

    boolean remove(); // remove element from the collection
    boolean remove(T el); // remove element from the collection

    boolean contains(T el); // check if the collection has "T" element

    boolean isEmpty(); // check if the collection it's been called upon is empty

    void clear(); // clear the collection

}
