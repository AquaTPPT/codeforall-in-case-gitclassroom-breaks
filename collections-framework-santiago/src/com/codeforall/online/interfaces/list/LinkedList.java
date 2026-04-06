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

    @Override
    //deberia ser remove (T el)
    public boolean remove(T el) {

        //declare 2 nodes: A to have a starting point to avoid the node we want to remove
        //B to compare each other data.
        Node<T> nodeA = head;
        Node<T> nodeB = head.getGetNextNode();

        //while we still have nodes to compare
        while (nodeB != null) {

            if(el.equals(nodeB.getData())){

            // we "jump" node B
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

        //declare interator to check each node starting not from the head but from
        //1st "index" (list do not have index).
        Node<T> iterator = head.getGetNextNode();

        //while we still have elements to check, we
        //compare de data of el with the data of iterator
        //if it founds the same we print, if not we jump to
        //the following node
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
