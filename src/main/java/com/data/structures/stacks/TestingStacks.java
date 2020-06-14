package com.data.structures.stacks;

import java.util.Scanner;

public class TestingStacks {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a mathematical expression: ");
        String input = scan.nextLine();
        Stacks<Integer> stk = new Stacks<>();
        stk.infixConversion(input);
        scan.close();

    }
}