package com.company;

public class number_pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for (int j = 5-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
