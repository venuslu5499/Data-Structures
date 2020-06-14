package com.data.structures.list;

public class SLLNode<T> {
    
    T info;
    SLLNode<T> next;

    public SLLNode(T el){
        info = el;
        next = null;
    }

    public SLLNode(T el, SLLNode<T> ptr){
        info = el;
        next = ptr;
    }

    public String toString(){
        return info.toString();
    }

}