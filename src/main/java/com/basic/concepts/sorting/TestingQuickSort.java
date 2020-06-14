package com.basic.concepts.sorting;

import java.util.Scanner;

public class TestingQuickSort {
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a set of numbers: ");
            String input = scan.nextLine();
            String arrString[] = input.split(" "); 
            int arrNum[] = new int[arrString.length];
            for(int i = 0; i < arrString.length; i++){
                arrNum[i] = Integer.parseInt(arrString[i]);
            }
            int n = arrNum.length;
            QuickSort qs = new QuickSort();
            qs.sort(arrNum, 0, n-1);
            System.out.println("Sorted array:");
            qs.printArray(arrNum);
        }

        
    }
}