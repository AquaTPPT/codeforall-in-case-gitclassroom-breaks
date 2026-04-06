package com.codeforall.online.interfaces.queue;

public interface QueueInterface<T> {

    boolean offer(T el); // add object to queue, returns true if successful

    T peek(); //returns the object at the head of the queue WITHOUT REMOVING

    T poll(); // returns the object at the head of the queue removing it

}
