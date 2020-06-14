package com.data.structures.trees;

public class BTNode<T> {

    T info;
    BTNode<T> left, right;

    public BTNode(T el){
        info = el;
        left = right = null;
    }
    
}