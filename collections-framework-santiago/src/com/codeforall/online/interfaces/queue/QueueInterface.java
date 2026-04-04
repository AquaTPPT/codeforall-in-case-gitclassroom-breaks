package com.codeforall.online.interfaces.queue;

public interface QueueInterface {

    boolean offer(Object el); // add object to queue, returns true if successful

    Object peek(); //returns the object at the head of the queue WITHOUT REMOVING

    Object poll(); // returns the object at the head of the queue removing it

}
