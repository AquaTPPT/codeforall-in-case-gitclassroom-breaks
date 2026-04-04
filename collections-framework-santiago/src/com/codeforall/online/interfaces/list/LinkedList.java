package com.codeforall.online.interfaces.list;

import com.codeforall.online.interfaces.Collection;

public class LinkedList implements ListInterface, Collection {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(Object el) {
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }

    public boolean remove(Object el) {
        return false;
    }

    public boolean remove(int el) {
        return false;
    }

    @Override
    public boolean contains(Object el) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object el) {
        return 0;
    }

    @Override
    public Object[] subList(int fromIndex, int toIndex) {
        return new Object[0];
    }
}
