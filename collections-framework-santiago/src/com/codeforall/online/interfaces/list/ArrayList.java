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
    public boolean add(Object el) { // create new add with index as well
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



    public boolean add(Object el, int index) {
        return false;
    }

    @Override
    public boolean remove(Object el) {
        return false;
    }

    public boolean remove(int index) { // should remove(Object obj)!!
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
        for (int i = 0; i < length; i++) {
            if (el == arr[i]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public void clear() {
        arr = null;
    }
}
