package com.company;

import java.util.*;

public class function2 {
    public static void table(int n)
    {
        for (int i = 1; i < 11 ; i++) {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any integer");
        int n= sc.nextInt();
        table(n);
    }
}
