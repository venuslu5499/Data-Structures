package com.data.structures.list;

public class TestingSLL {

    public static void main(String[] args){

        SLL<Integer> sample = new SLL<>();
        sample.addToHead(3);
        sample.addToTail(2);
        sample.addToTail(4);
        sample.addToHead(9);
        sample.deleteFromTail();
        sample.addToTail(8);
        sample.deleteFromHead();
        System.out.println(sample.toString());

    }
    
}