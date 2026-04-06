package com.codeforall.online.interfaces.queue;

import com.codeforall.online.interfaces.Collection;

public class Queue implements QueueInterface, Collection {
    private Object[] arr; // this can be done with arrays or LinkedLists (nodes, pretty much). change this later on
    private int length = 0;


    //should return a boolean representing if the operation was successful;
    //it should add an object to the Queue.
    @Override
    public boolean offer(Object el) {
        if (arr == null){
            arr = new Object[1];
            arr[0] = el;
            length = 1;
            return true;
        }

        Object[] arrTemp = new Object[length + 1];

        for (int i = 0; i < length; i++){
            arrTemp[i] = arr[i];
        }
        arrTemp[length] = el;

        arr = arrTemp;
        length++;

        return true;
    }


    //should return the object at the head of the queue without removing it.
    @Override
    public Object peek() {
        return arr[0];
    }

    //should return the object of the head of the queue, removing it.
    @Override
    public Object poll() {
        if (length <= 0) {
            return false;
        }

        Object firstIndex = arr[0];

        Object[] arrTemp = new Object[length -1];
        for (int i = 0; i < arr.length - 1; i++) {

            arrTemp[i] = arr[i + 1];

        }
        arr = arrTemp;
        length--; //also applies to poll lenght++; ?
        return firstIndex;
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

    public Object[] resize(Object[] arr) {««
        Object[] arrTemp = arr;

        arr = new Object[arrTemp.length * 2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrTemp[i];
        }

        arr = arrTemp;
    }

    @Override
    public boolean remove() { // ????? mayhaps, check this later, change index later!!!
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