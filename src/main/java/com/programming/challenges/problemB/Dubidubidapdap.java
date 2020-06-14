package com.programming.challenges.problemB;

public class Dubidubidapdap {

    public int getMissingNumber(int[] lies){
        int sumOfAll = (lies.length*(lies.length+1)/2);
        int sumOfArray = 0; 

        for(int i = 0; i < lies.length; i++){
            sumOfArray += lies[i];
        }
        return sumOfAll-sumOfArray;
    }

    public String trollSolver(int n, String[] lies){
        String code = "";
        
        for(int i = 0; i <= n-1; i++){
            String [] arr = lies[i].split(" ");
            int[] arr2 = new int[9];
            for(int j = 0; j < 9; j++){
                arr2[j] = Integer.parseInt(arr[j]);
            }
            code += getMissingNumber(arr2);
        }

       return code;
    }
    
}