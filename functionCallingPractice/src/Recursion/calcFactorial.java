package Recursion;

import java.util.Scanner;

public class calcFactorial {
    public static int printFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int factorial_nm1 = printFactorial(n-1);
        int factorial_n = n*factorial_nm1;
        return factorial_n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = printFactorial(n);
        System.out.println(ans);
    }
}
