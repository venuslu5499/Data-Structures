package com.programming.challenges.problemA;

import com.data.structures.queues.*;

public class Josephus {
    
    public int josephusSolver(int n, int k){
        Queues<Integer> survivor = new Queues<>(n);
        int last = 0;
        for(int i = 0; i <= n; i++){
            survivor.enqueue(i+1);
        }

        while(!survivor.isEmpty()){
            for(int i = 0; i < k-1; i++){
                survivor.enqueue(survivor.dequeue());
            }

            last = survivor.dequeue();
        }

        return last;
    }
}