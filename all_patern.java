package com.company;
import java.util.*;
public class all_patern {
    public static void main(String[] args) {
        //soild rohumbs
//        int n=3;
//        for (int i = 1; i <=3 ; i++) {
//            for (int j = 1; j <=3 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }








//         hollow rohumbus
//        int n =4,m=5;
//        for(int i=1;i<=n;i++){
//            for (int j = 1; j <=m; j++) {
//                if(i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//      *
//      **
//      ***
//      ****
//        int n=4;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//      ***
//      **
//      *
//        int n=4;
//        for (int i = n; i >=1 ; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        //pyramid
//        int n=4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //1
        //12
        //123
        //1234
//        int n=4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        int n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

//        int n=4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                int sum=i+j;
//                if(sum%2==0){
//                    System.out.print("1");
//                }else{
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }

//        int n=3;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(j%2==0){
//                    System.out.print("0 ");
//                }else{
//                    System.out.print("1 ");
//                }
//
//            }System.out.println();
//        }


//        int n=3;
//
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            //for spaces
//            for(int j=1; j<=2 * (n-i); j++) {
//                System.out.print(" ");
//            }
//
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }









    }
}


