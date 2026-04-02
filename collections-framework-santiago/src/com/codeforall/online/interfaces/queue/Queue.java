package com.codeforall.online.interfaces.queue;

import com.codeforall.online.interfaces.Collection;

public class Queue implements QueueInterface, Collection {
    private Object[] arr; // this can be done with arrays or LinkedLists (nodes, pretty much). change this later on
    private int length = 0;

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
        return length;
    }

    @Override
    public boolean add(Object el) {
        Object[] arrTemp = arr;
        arr = new Object[length + 1];
        if (arrTemp == null) {
            arr[length] = el;
            length++;
            return true;
        }
        for (int i = 0; i < arrTemp.length; i++) {
            arr[i] = arrTemp[i];
        }
        arr[length] = el;
        length++;
        return true;
    }

    @Override
    public boolean remove(Object el) { // ????? mayhaps, check this later, change index later!!!
        if (length <= 0 || index >= length) {
            return false;
        }
        Object[] arrTemp = new Object[length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                arrTemp[i] = arr[i];
            }
            else if (i == index) {
            }
            else {
                arrTemp[i - 1] = arr[i];
            }
        }
        arr = arrTemp;
        return true;
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
