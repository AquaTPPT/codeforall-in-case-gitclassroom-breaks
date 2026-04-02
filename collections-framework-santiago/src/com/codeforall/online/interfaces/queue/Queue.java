package com.codeforall.online.interfaces.queue;

import com.codeforall.online.interfaces.Collection;

public class Queue implements QueueInterface, Collection {
    @Override
    public boolean offer() {
        return false;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

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
