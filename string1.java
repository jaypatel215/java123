package com.company;
import java.util.*;
public class string1 {
    public static void main(String[] args) {
//        String str = "Automation";
//        StringBuilder str2 = new StringBuilder();
//        str2.append(str);
//        str2 = str2.reverse();     // used string builder to reverse
//        System.out.println(str2);

        String str= "Geeks", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }





    }


