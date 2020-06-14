package com.data.structures.priorityqueue;

public class PriorityQueues{

    int heapSize = 0;
    int heapLength = 10;
    int que[] = new int[heapLength];

    public void heapsEnqueue(int el){
        if(heapSize + 1 > heapLength){
            return;
        } else {
            heapSize = heapSize+1;
            que[heapSize] = el;
            heapifyUp(heapSize);
        } 
    }

    public void heapifyUp(int size){
        int el = que[size];
        while(size > 1 && que[size/2] < el){
            que[size] = que[size/2];
            size = size/2;
        }
        que[size] = el;
    }

    public void heapsDequeue(){
        if(heapSize == 0){
            return;
        } else {
            que[1] = que[heapSize];
            que[heapSize] = 0;
            heapSize = heapSize - 1;
            heapifyDown(1);
        }
    }

    public void heapifyDown(int size){
        int l = size*2;
        int r = (size*2)+1;
        int largest;
        
        if(l <= heapSize && que[l] > que[size]){
           largest = l;
        } else {
            largest = size;
        }

        if(r <= heapSize && que[r] > que[largest]){
            largest = r;
        }  

        if(largest != size){
            int temp = que[size];
            que[size] = que[largest];
            que[largest] = temp;
            heapifyDown(largest);
        }    
    }

    public void printArray(){ 
        int n = que.length; 
        for (int i=1; i<n; ++i) 
            System.out.print(que[i]+" "); 
        System.out.println(); 
    }   

    

}