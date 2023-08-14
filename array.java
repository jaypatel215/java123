package com.company;
import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        String name[]=new String[size];


        for (int i = 0; i < size; i++) {
            System.out.println("enter"+(i+1)+"th name");
            name[i]=sc.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(name[i]);
        }

    }
}
