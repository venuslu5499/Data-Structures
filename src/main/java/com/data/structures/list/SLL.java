package com.data.structures.list;

public class SLL<T> {
    
    SLLNode<T> head, tail; 

    public SLL(){
        head = tail = null;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        } else {
            return false;
        }
    }

    public T find(T sample){
        SLLNode<T> p = head;
        while(p.next != null && p.info != sample){
            p = p.next;
        }
        return p.info;
    }

    public String addToHead(T el){
        SLLNode<T> p = new SLLNode<>(el, head);
        head = p;

        if(tail == null){
            tail = head;
        }
        return head.info.toString();
    }

    public void addToTail(T el){
        if(isEmpty()){
            head = tail = new SLLNode<>(el, null);
        } else {
            tail.next = new SLLNode<>(el, null);
            tail = tail.next;
        }
    }

    public T deleteFromHead(){
        if(isEmpty()){
            return null;
        } else {
            if(head == tail){
                head = tail = null;
            } else {
                head = head.next;
            }
        }
        return tail.info;
    }

    public T deleteFromTail(){
        if(isEmpty()){
            return null;
        } else {
            if(head == tail){
                head = tail = null;
            } else {
                SLLNode<T> p;
                for(p = head; p != null; p=p.next){
                    if(p.next == tail){
                        tail = p;
                        tail.next = null;
                        break;
                    }
                }
            }
        }
        return tail.info;
    }

    public String toString(){
        SLLNode<T> p;
        String s = " ";
        for(p = head; p != null; p=p.next){
            s += p.info.toString();
        }
        return s;
    }
}