package com.programming.challenges.problemB;

import java.util.Scanner;

public class TestingDubidubidapdap {

    public static void main(String[] args){
        
        Dubidubidapdap dub = new Dubidubidapdap();
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if(1 <= n && n <= (10^5)){
            String lies[] = new String[n];
            for(int i = 0; i < n; i++){
                lies[i] = scan.nextLine();
            }
            System.out.println(dub.trollSolver(n, lies));
        }
        scan.close();
    }
    
}