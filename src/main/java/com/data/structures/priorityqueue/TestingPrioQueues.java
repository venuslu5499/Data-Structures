package com.data.structures.priorityqueue;

public class TestingPrioQueues {

    public static void main(String[] args){
        PriorityQueues pq = new PriorityQueues();
        pq.heapsEnqueue(1);
        pq.heapsEnqueue(5);
        pq.heapsEnqueue(3);
        pq.heapsEnqueue(6);
        pq.heapsDequeue();
        pq.printArray();
    }
    
}