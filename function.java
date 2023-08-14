package com.company;
import java.util.*;

public class function {
    public static void evenOdd( int n){
        if(n%2==0){
            System.out.println("this a even number");
        }
        else{
            System.out.println("this is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any integer");
        int n= sc.nextInt();
        evenOdd(n);

    }
}
