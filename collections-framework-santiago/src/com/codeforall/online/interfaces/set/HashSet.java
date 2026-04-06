package com.codeforall.online.interfaces.set;

import com.codeforall.online.interfaces.Collection;

public class HashSet implements SetInterface, Collection {
    private int length = 0;
    private Object[] arr = new Object[16];
    private double loadFactor = 0;
    private int objectCounter = 0;
    // load factor missing!!!

    @Override
    public int size() {
        return arr.length;
    }

    public int indexOf(Object el) {
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
    public boolean add(Object el) {
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

    public boolean remove(Object el) {
        int index = setHashPosition(el);

        if (arr[index] != null && arr[index] == el) {
            arr[index] = null;
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

    private Object[] resize(Object[] arr) {
        Object[] arrTemp = arr;

        arr = new Object[arrTemp.length * 2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrTemp[i];
        }

        return arr = arrTemp;
    }

    private int setHashPosition(Object el) {
        int hashCode = el.hashCode();
        return Math.abs(hashCode % arr.length);
    }

    private double addPercentage() {
        return loadFactor += (1 / arr.length) * 100;
    }

    private double removePercentage() {
        return loadFactor -= (1 / arr.length) * 100;
    }

    private double redoPercentages() {
        return loadFactor = (objectCounter / arr.length) * 100;
    }

    @Override
    public boolean isEmpty() {
        for (Object el : arr) {
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