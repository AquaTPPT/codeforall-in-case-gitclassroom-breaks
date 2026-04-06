package com.codeforall.online.interfaces.list;

import com.codeforall.online.interfaces.Collection;

public class ArrayList<T> implements ListInterface<T>, Collection<T> {
    private int length = 0;
    private T[] arr;

    @Override
    public T get(int index) {
        return arr[index];
    }

    @Override
    public int indexOf(T el) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public T[] subList(int fromIndex, int toIndex) {
        int counter = 0;
        for (int i = fromIndex; i <= toIndex; i++) {
            counter++;
        }
        T[] arrTemp = (T[]) new Object[counter];
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
    public boolean add(T el) { // create new add with index as well
        T[] arrTemp = arr;
        arr = (T[]) new Object[length + 1];
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
    public boolean remove() {
        return false;
    }


    public boolean add(T el, int index) {
        return false;
    }


    public boolean remove(T el) {
        return false;
    }

    public boolean remove(int index) { // should remove(Object obj)!!
        if (length <= 0 || index >= length) {
            return false;
        }
        T[] arrTemp = (T[]) new Object[length - 1];
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
    public boolean contains(T el) {
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
