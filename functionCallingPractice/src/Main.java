import java.util.*;

public class Main {
    public static void calcFibonacci(int a, int b, int n){
        if(n == 0){
            return ;
        }

        int c = a+b;
        System.out.println(c);
        calcFibonacci(b, c, n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);

        calcFibonacci(a, b, n-2);
    }
}