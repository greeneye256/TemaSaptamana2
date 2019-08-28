package com.simedia.demos;

public class Utils {
    int sumOfCharsInString (String str){
        int result=0;
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }
}