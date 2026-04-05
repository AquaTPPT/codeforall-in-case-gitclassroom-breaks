package com.codeforall.online.interfaces;

public class Node<T> {
    private T data;
    private Node<T> nextNode;

    public Node(T data) { // let's assume it's a string for now
        this.data = data;
        this.nextNode = null;
    }

    public T getData() { return data; } // string for now, set something else later
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getGetNextNode() {
        return nextNode;
    }
}
