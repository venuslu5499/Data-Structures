package com.data.structures.queues;

@SuppressWarnings("unchecked")

public class Queues<T>{
    
    public int maxQSize = 100;
    public int front = -1;
    public int rear = -1;  
    public Object que[];   
    
    public Queues(){
        que = new Object[maxQSize];
    }

    public Queues(int size){
        if(size > 0){
            maxQSize = size;
        }    
        que = new Object[maxQSize];
    }

    public boolean isEmpty(){
        return (front == -1);
    }

    public boolean isFull(){
        return ((rear+1)%maxQSize == front);
    }

    public T peek(){
        if(!isEmpty()){
            return (T)que[front];
        } else {
            return null;
        }
    }

    public void clear(){
        front = rear = -1;
    }

    public T enqueue(T el){
        if(!isFull()){
            rear = (rear+1)%maxQSize;
            que[rear] = el;
            if(front == -1){
                front = 0;
            }
            return el;
        } else {
            return null;
        }
    }

    public T dequeue(){
        if(!isEmpty()){
            T el = (T)que[front];
            if(front == rear){
                clear();
            } else {
                front = (front+1)%maxQSize;
            }
            return el;
        } else {
            return null;
        }
    }
}