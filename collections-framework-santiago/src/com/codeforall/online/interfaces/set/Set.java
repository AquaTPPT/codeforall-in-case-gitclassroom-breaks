package com.codeforall.online.interfaces.set;

import com.codeforall.online.interfaces.Collection;

public class Set implements SetInterface, Collection {
    private int length = 0;
    private Object[] arr;

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
    public boolean add(Object el) { // adding objects
        if (arr == null) {
            arr = new Object[1];
            arr[length] = el;
            length++;
            return true;
        }
        for (Object element : arr) {
            if (element == el) {
                return false;
            }
        }
        Object[] arrTemp = arr;
        arr = new Object[length + 1];
        for (int i = 0; i < arrTemp.length; i++) {
            arr[i] = arrTemp[i];
        }
        arr[length] = el;
        length++;
        return true;
    }

    public boolean add(Object el, int index) {
        if (arr == null) {
            arr = new Object[1];
            arr[length] = el;
            length++;
            return true;
        }
        for (Object element : arr) {
            if (element == el) {
                return false;
            }
        }
        Object[] arrTemp = arr;
        arr = new Object[length + 1];
        if (length - 1 > index) {
            arr[length] = el;
            length++;
            return true;
        }
        for (int i = 0; i < arrTemp.length; i++) {
            if (i < index) {
                arr[i] = arrTemp[i];
            }
            else if (i == index) {
                arr[i] = el;
            }
            else {
                arr[i] = arrTemp[i - 1];
            }
        }
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
        if (arr == null) {
            return false;
        }
        for (Object element : arr) {
            if (el == element) {
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
        arr = new Object[0];
    }
}
