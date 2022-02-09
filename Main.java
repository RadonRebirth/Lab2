package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double D = 3.14/2;
        double summ = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        for(var j=0;j<=n;j++) {
            double arcctgx = (Math.pow(-1,n+1))*(Math.pow(x,2*n+1))/2*n+1;
            summ = summ+arcctgx;
        }
        D = summ+D;
        System.out.println(D);
        if (n < 0){
            System.out.println("Вы ввели неверное значение!");
        }
        if (x > 1){
            System.out.println("Вы ввели неверное значение!");
        }
    }
}
