package com.data.structures.bags;

public class BNode<T>{
    
    T info;
    BNode<T> next;

    public BNode(T el){
        info = el;
        next = null;
    }

    public BNode(T el, BNode<T> n){
        info = el;
        next = n;
    }

}