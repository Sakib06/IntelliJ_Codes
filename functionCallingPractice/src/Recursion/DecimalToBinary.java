package Recursion;
import java.util.*;

public class DecimalToBinary {

    public static int power(int i, int x, int n){
        for(i=1; i<=n; i++){
            x = x*2;
            if(x-1 >= n){
                //return i;
                break;
            }
        }
        return i;
    }

    public static void arrayIndex(int[] arr, int j, int x){
        for(int k=0; k<j; k++){
            arr[k] = x;
            x = x*2;
            System.out.println(arr[k]);
        }
    }
    public static void recursion(int[] arr, int j, int z){
        if(z>j)
            return;
        if(z == j)
        for(int i=j-1; i>0; i--){

        }
        recursion(j-1, );

        z += 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1, x=1, z=1 ;
        int j = power(i, x, n);
        int[] arr = new int[j];

        arrayIndex(arr, j, x);
        recursion(j, z, arr);
    }
}
