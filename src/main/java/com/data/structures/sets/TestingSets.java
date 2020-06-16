package com.data.structures.sets;

public class TestingSets {
    
    public static void main(String[] args){

        Sets<String> s1 = new Sets<>();
        s1.addItem("1st");
        s1.addItem("2nd");
        s1.addItem("3rd");
        s1.addItem("2nd");
        s1.addItem("1st");
        s1.addItem("4th");
        s1.addItem("5th");
        s1.printArray();

    }

}