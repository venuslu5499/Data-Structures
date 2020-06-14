package com.data.structures.sets;

public class Sets<T> {
    
    int maxSetSize = 100;
    int size = 0;
    Object arr[];

    public Sets(){
        arr = new Object[maxSetSize];
    }

    public Sets(int input){
        maxSetSize = input;
        arr = new Object[maxSetSize];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(T el){
        boolean con = false;
        if(!isEmpty()){
            for(int i = 1; i <= size; i++){
                if(arr[i] == el){
                    con = true;
                    break;
                }
            }
        } else {
            con = false;
        }
        return con;
    }

    public void addItem(T el){
        if(contains(el)){
            return;
        } else {
            size = size + 1;
            arr[size] = el;
        }
    }

    public void printArray(){
        int n = size;
        for(int i = 1; i <= n; i++){
            System.out.print(arr[i] +" ");
        }
    }

}