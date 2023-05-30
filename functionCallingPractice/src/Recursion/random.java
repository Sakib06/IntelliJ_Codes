package Recursion;

import java.util.Scanner;

public class random {

    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        int pow_nm1 = calcPower(x, n-1);
        int pow_n = x*pow_nm1;
        return pow_n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
