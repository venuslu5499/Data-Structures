package com.programming.challenges.problemC;

public class Superhero {

    public boolean isVowel(char name){
        if(name =='a' || name == 'e' || name == 'i' || name == 'o' || name == 'u'){
            return true;
        } else {
            return false;
        } 
    }

    public String transformSuperhero(char[] s, char[] t){
        String trans = "";
        for(int i = 0; i < s.length; i++){
            if(s.length != t.length){
                trans = "No";
                break;
            } else if(isVowel(s[i]) != isVowel(t[i])){ 
                trans = "No";
            }else {
                trans =  "Yes";
            }
        }

        return trans;
    }
    
}