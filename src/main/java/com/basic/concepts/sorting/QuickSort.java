package com.basic.concepts.sorting;

public class QuickSort {
    
    public int partition(int arr[], int low, int high){
        int temp;

        int sum = 0;
        for(int x = low; x <= high; x++){
            sum += arr[x];
        }
        int total = high - low + 1;
        int average = (int)Math.floor(sum/(total));

        int min = Math.abs(arr[low] - average);
        int idx = low;
        for(int y = low + 1; y <= high; y++){
            int distance = Math.abs(arr[y] - average);
            if(distance < min){
                idx = y;
                min = distance;
            }
        } 

        temp = arr[idx]; 
        arr[idx] = arr[high]; 
        arr[high] = temp; 
        int pivot = arr[high];
        int i = (low-1);

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++; 
  
                temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            }
        }
        temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
        
    }

    public void sort(int arr[], int low, int high){
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    }

    public void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }    
}