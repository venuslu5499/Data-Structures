package com.data.structures.queues;

public class TestingQueues {

    public static void main(String[] args){

        Queues<String> que = new Queues<>();
        que.enqueue("1st");
        que.enqueue("2nd");
        que.enqueue("3rd");
        que.enqueue("4th");
        que.dequeue();
        System.out.println(que.toString());

    }
    
}