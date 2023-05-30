package newPackage_name;
import java.util.Scanner;

public class Recursion2 {

    public static int first = -1;
    public static int last = -1;
    public static void printIndex(String str, char element, int idx){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1)
                first = idx;
            else
                last = idx;
        }
        printIndex(str, element, idx+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "abaacdaefaah";
        char element = sc.next().charAt(0);
        printIndex(str, element, 0);
    }
}