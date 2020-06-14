package com.data.structures.bags;

public class Bags<T> {
    
    BNode<T> first;
    int idx = 0;

    public Bags(){
        first = null;
        idx = 0;
    }

    public boolean isEmpty(){
        return idx == 0;
    }

    public void addItem(T el){
        if(isEmpty()){
            BNode<T> n = new BNode<>(el);
            first = n;
            idx = idx+1;
        } else {
            BNode<T> n = first;
            if(n.next != null){
                n = n.next;
            } else {
                n.next = new BNode<T>(el);
                idx = idx+1;
            }
        }
        
    }

}