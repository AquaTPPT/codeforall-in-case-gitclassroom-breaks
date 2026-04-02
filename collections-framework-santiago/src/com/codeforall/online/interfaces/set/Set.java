package com.codeforall.online.interfaces.set;

import com.codeforall.online.interfaces.Collection;

public class Set implements SetInterface, Collection {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(Object el) {
        return false;
    }

    @Override
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
}
