package com.codeforall.online.interfaces.set;

import com.codeforall.online.interfaces.Collection;

public class HashSet implements SetInterface, Collection {
    private int length = 0;
    private Object[] arr = new Object[16];

    @Override
    public int size() {
        return length;
    }

    public int indexOf(Object el) {
        if (length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public boolean add(Object el) {
        int index = setHashPosition(el);

        if (arr[index] != null && arr[index] != el) {
            int iteration = index;
            while (arr[iteration] != null) {
                if (arr[iteration] == null) {
                    arr[iteration] = el;
                    return true;
                }
            }
        }

        arr[index] = el;

        return true;
    }


    @Override
    public boolean remove() {
        if (length <= 0) {
            return false;
        }
        Object[] arrTemp = new Object[length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arrTemp[i] = arr[i];
        }
        arr = arrTemp;
        return true;
    }

    public boolean remove(int index) {
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

    public boolean remove(Object el) {
        int index = indexOf(el);
        if (index == -1) {
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
        return true;
    }


    @Override
    public boolean contains(Object el) {
        int index = setHashPosition(el);
        if (arr[index] != null && arr[index] == el) {
            return true;
        }
        else {
            int iterator = index;
            while (setHashPosition(arr[iterator]) == index) {
                if (arr[iterator] != null && arr[index] == el) {
                    return true;
                }
                iterator++;
            }
        }
        return false;
    }

    public int setHashPosition(Object el) {
        int hashCode = el.hashCode();
        return Math.abs(hashCode % arr.length);
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