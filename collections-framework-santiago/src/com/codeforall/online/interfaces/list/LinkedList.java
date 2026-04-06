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
        Node<T> iterator = head;
        while(iterator.getGetNextNode() != null){
            iterator = iterator.getGetNextNode();
            if(iterator.getData().equals(el)){
                return false;
            }
        }
        Node<T> newNode = new Node<>(el);
        iterator.setNextNode(newNode);
        lenght++;
        return true;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public boolean remove(T el) {

        Node<T> nodeA = head;
        Node<T> nodeB = head.getGetNextNode();

        while (nodeB != null) {
            if(el.equals(nodeB.getData())){
            nodeA.setNextNode((nodeB.getGetNextNode()));
            lenght--;
            return true;
        }
            nodeA = nodeB;
            nodeB = nodeB.getGetNextNode();
        }
        return false;
    }



    public boolean remove(int el) {
        return false;
    }

    @Override
    public boolean contains(T el) {
        Node<T> iterator = head.getGetNextNode();
        while (iterator != null){
            if(el.equals(iterator.getData())){
                System.out.println("we found the data");
                return true;
            }
            iterator = iterator.getGetNextNode();
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return lenght == 0;
    }

    @Override
    public void clear() {
        head.setNextNode(null);
        lenght = 0;
    }

    @Override
    public T get(int index) {

        if (lenght == 0 || index < 0 || index >= lenght){
            return null;
        }
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
