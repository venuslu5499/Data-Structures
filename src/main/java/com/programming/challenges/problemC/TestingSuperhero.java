package com.programming.challenges.problemC;

import java.util.Scanner;

public class TestingSuperhero {
    
    public static void main(String[] args){
        
        Superhero sup = new Superhero();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        System.out.println(sup.transformSuperhero(s.toLowerCase().toCharArray(), t.toLowerCase().toCharArray()));
        scan.close();
    }
}