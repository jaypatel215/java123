package com.company;

public class palindromic_number_pyramid {
    public static void main(String[] args) {
        int n= 5;

        for (int i = 1; i <=5 ; i++) {
            for (int j = 5-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >=1 ; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <=i ; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
