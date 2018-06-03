package com.dakoto.datastructuresandalgorithms.datastructures;

import com.dakoto.datastructuresandalgorithms.datastructures.LinkedLists.SinglyLinkedList;

public class Stack<T> implements DataStructure {

    private SinglyLinkedList<T> linkedList;

    private int size = 0;

    public void push(T value){

        if(this.linkedList == null){

            this.linkedList = new SinglyLinkedList<T>(value);
            linkedList.setIshead(true);
        }else{

            SinglyLinkedList<T> newHead = new SinglyLinkedList(value);

            newHead.setIshead(true);
            newHead.setNext(this.linkedList);

            this.linkedList = newHead;
        }

        this.size++;
    }

    public T peek(){

        if(this.linkedList == null){

            System.out.println("the list is empty");
            return null;
        }else{

            return this.linkedList.getValue();
        }
    }

    public SinglyLinkedList<T> pop() {

        SinglyLinkedList<T> popped = new SinglyLinkedList<T>(this.linkedList.getValue());

        this.linkedList = this.linkedList.next();
        this.linkedList.setIshead(true);

        this.size--;

        return popped;
    }

    @Override
    public void test() {
        System.out.println("############################ testing push");

        System.out.println("############################ testing peek");

        System.out.println("############################ testing pop");

    }

    @Override
    public void traverse() {

        System.out.println("############################ traversing Queue");
        this.linkedList.traverse();
        System.out.println("############################ done traversing Queue");
    }

    @Override
    public void empty() {

        while(this.linkedList != null){
            this.pop();
        }
    }

    @Override
    public int getSize() {

        return this.size;
    }
}
