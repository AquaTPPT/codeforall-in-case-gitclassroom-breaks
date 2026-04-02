package com.codeforall.online.interfaces.list;

import com.codeforall.online.interfaces.Collection;

public class ArrayList implements ListInterface, Collection {
    private int length = 0;
    private Object[] arr;

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public int indexOf(Object el) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public Object[] subList(int fromIndex, int toIndex) {
        int counter = 0;
        for (int i = fromIndex; i <= toIndex; i++) {
            counter++;
        }
        Object[] arrTemp = new Object[counter];
        counter = 0;
        for (int i = fromIndex; i <= toIndex; i++) {
            arr[i] = arrTemp[counter];
            counter++;
        }
        return arrTemp;
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
    public boolean remove(int el) {
        return false;
    }

    @Override
    public boolean contains(Object el) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public void clear() {
        arr = new Object[0];
    }


}
