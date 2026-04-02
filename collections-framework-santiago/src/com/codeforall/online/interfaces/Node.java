package com.codeforall.online.interfaces;

public class Node {
    private String data;
    private Node nextNode;

    public Node(String data) { // let's assume it's a string for now
        this.data = data;
        this.nextNode = null;
    }

    public String getData() { return data; } // string for now, set something else later
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getGetNextNode() {
        return nextNode;
    }
}
