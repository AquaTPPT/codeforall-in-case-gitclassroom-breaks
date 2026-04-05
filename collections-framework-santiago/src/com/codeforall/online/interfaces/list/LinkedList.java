package com.codeforall.online.interfaces.list;

import com.codeforall.online.interfaces.Collection;
import com.codeforall.online.interfaces.Node;

public class LinkedList<T> implements ListInterface<T>, Collection<T> {

    Node<T> head;
    private int lenght = 0;

    public LinkedList(){
        head = new Node<>(null);
    }

    @Override
    public int size() {
        return lenght;
    }

    @Override
    public boolean add(T el) {
        //create iterator node, starting at Head
        Node<T> iterator = head;
        //while iterator get next node != null, get next node
        //check if el already exists (considering that head is null is necesary to do
        while(iterator.getGetNextNode() != null){
            iterator = iterator.getGetNextNode();
            if(iterator.getData().equals(el)){
                return false;
            }
        }
        //create node with el
        Node<T> newNode = new Node<>(el);
        //when next node is found, set next node to new node
        iterator.setNextNode(newNode);
        //increments lenght
        lenght++;
        return true;
    }

    @Override
    public boolean remove() {
        return false;
    }

    public boolean remove(T el) {
        return false;
    }

    public boolean remove(int el) {
        return false;
    }

    @Override
    public boolean contains(T el) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {

        //if index >= lenght || if index < 0 || if list is empty
        if (lenght == 0 || index < 0 || index >= lenght){
            return null;
        }
        //create iterator already pointing "first index"(with data)
        Node<T> iterator = head.getGetNextNode();
        for (int i = 0; i < index; i++){
            iterator = iterator.getGetNextNode();
        }


        return iterator.getData();
    }

    @Override
    public int indexOf(T el) {
        return 0;
    }

    @Override
    public Object[] subList(int fromIndex, int toIndex) {
        return new Object[0];
    }
}
