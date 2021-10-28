package com.company;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if(this.isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);

        if(this.isEmpty()) {
            first = last = node;
        } else {
            node.next = node;
            first = node;
        }
        size++;
    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while(current != null) {
            if(current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
      return indexOf(item) != -1;
    }

    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
            size--;
    }

    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;
        } else {
            var previous = this.getPrevious(first);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node){
        var current = first;
        while(current != null) {
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;

        while(current != null) {
            array[index] = current.value;
            index++;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        Node previous = null;
        Node current = first;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        first = previous;
    }

    public int getKthNodeFromTheEnd(int k) {
        if(isEmpty()){
            throw new IllegalStateException();
        }
        int distance = k - 1;
        var a = first;
        var b = first;
        for(int i = 0; i < distance; i++)
            b = b.next;
        if(b == null) {
            throw new IllegalArgumentException();
        }
        while(b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

}
