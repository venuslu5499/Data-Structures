package com.data.structures.trees;

import com.data.structures.queues.*;

public class BTree<T> {

    BTNode<T> root;
    
    public BTree(){
        root = null;
    }

    public boolean isEmpty(){
        if(root == null){
            return true;
        } else {
            return false;
        }
    }

    public boolean isLeaf(BTNode<T> n){
        if(n == null){
            return false;
        } else {
            return (n.left == null && n.right == null);
        }
    }

    public BTNode<T> setRoot(T el){
        root = new BTNode<>(el);
        return root;
    }

    public BTNode<T> setLeft(BTNode<T> n, T el){
        if (n == null){
            return null;
        } else {
            n.left = new BTNode<>(el);
            return n.left;
        }
    }

    public BTNode<T> setRight(BTNode<T> n, T el){
        if(n == null){
            return null;
        } else {
            n.right = new BTNode<>(el);
            return n.right;
        }
    }

    public BTNode<T> addNode(T el){
        BTNode<T> node = new BTNode<>(el);
        if(root == null){
            node = root;
        } else {
            node = root;
            while(node != null){
                
            }
        }
        return node;
    }

    public String BreadthFirstSearch(){
        Queues<BTNode<T>> que = new Queues<>();
        BTNode<T> p;
        String nodes = "";
        if(root != null){
            p = root;
            que.enqueue(root);
            while(!que.isEmpty()){
                p = que.dequeue();
                nodes += p.info.toString() +" ";
                if(p.left != null){
                    que.enqueue(p.left);
                } 
                if(p.right != null){
                    que.enqueue(p.right);
                }
            }
        }
        return nodes;
    }
    
}