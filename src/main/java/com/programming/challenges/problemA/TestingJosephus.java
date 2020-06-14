package com.programming.challenges.problemA;

import java.util.Scanner;

public class TestingJosephus {
    
    public static void main(String[] args) {

        Josephus jos = new Josephus();
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.nextLine());
            int k = Integer.parseInt(scan.nextLine());
            System.out.println(jos.josephusSolver(n, k));
        }
        
    }
}