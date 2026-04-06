package com.codeforall.online.interfaces.set;

import com.codeforall.online.interfaces.Collection;

public class HashSet<T> implements SetInterface<T>, Collection<T> {
    private int length = 0;
    private T[] arr = (T[]) new Object[16];
    private double loadFactor = 0;
    private int objectCounter = 0;

    @Override
    public int size() {
        return arr.length;
    }

    public int indexOf(T el) {
        int index = setHashPosition(el);
        if (arr[index] == null) {
            return -1;
        }
        else if (arr[index] != el) {
            int iteration = index;
            while (arr[iteration] != null) {
                if (arr[iteration] == null) {
                    arr[iteration] = el;
                    return iteration;
                }
            }
        }
        return -1;
    }


    @Override
    public boolean add(T el) {
        if (loadFactor >= 0.9) {
            resize(arr);
            redoPercentages();
        }
        int index = setHashPosition(el);
        if (arr[index] != null && arr[index] != el) {
            int iteration = index;
            while (arr[iteration] != null) {
                if (arr[iteration] == null) {
                    arr[iteration] = el;
                    addPercentage();
                    objectCounter++;
                    return true;
                }
            }
        }
        else if (arr[index] == el) {
            return false;
        }
        arr[index] = el;
        addPercentage();
        objectCounter++;
        return true;
    }

    @Override
    public boolean remove() {
        arr[arr.length - 1] = null;
        return true;
    }

    public boolean remove(int index) {
        arr[index] = null;
        return true;
    }

    public boolean remove(T el) {
        int index = setHashPosition(el);

        if (arr[index] != null && arr[index] == el) {
            arr[index] = null;
            removePercentage();
            return true;
        }
        else {
            int iterator = index;
            while (setHashPosition(arr[iterator]) == index) {
                if (arr[iterator] != null && arr[iterator] == el) {
                    arr[iterator] = null;
                    return true;
                }
                iterator++;
            }

        }
        return false;
    }


    @Override
    public boolean contains(T el) {
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

    private T[] resize(T[] arr) {
        T[] arrTemp = arr;

        arr = (T[]) new Object[arrTemp.length * 2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrTemp[i];
        }

        return arr = arrTemp;
    }

    private int setHashPosition(T el) {
        int hashCode = el.hashCode();
        return Math.abs(hashCode % arr.length);
    }

    private void addPercentage() {
        objectCounter++;
        redoPercentages();
    }

    private void removePercentage() {
        objectCounter--;
        redoPercentages();
    }

    private void redoPercentages() {
        loadFactor = (objectCounter / arr.length) * 100;
    }

    @Override
    public boolean isEmpty() {
        for (T el : arr) {
            if (el != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < arr.length; i++) {
          arr[i] = null;
        }
    }
}