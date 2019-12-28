package com.example.lex;
import java.util.*;
import java.lang.*;
import static java.lang.Math.*;

public class lex {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите А : ");
        int A = in.nextInt();
        System.out.println("A=" + A);
        System.out.println("Введите В : ");
        int B = in.nextInt();
        System.out.println("B="+B);
        System.out.println("K=(((A + 19) + (5 / sin(B)) * (3)^ - cos(A) + (B)");
        double K;
        K = ((A + 19) + 5 / sin(B)) * pow(3,2) - cos((A) +(B));
        System.out.println(K);
        if(A<B) {
            for (int i = 0; i < A; i++) {
                if (i != B) {
                    System.out.println("i!= A :" + i);
                }
                else {
                    System.out.println("Верно :" + i);
                }
            }
        }
        else{
            for (int i =0; i < K; i++){
                System.out.print("прочее"+ i);
            }
        }
    }
}


