
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] nums = new int[arraySize];

        for(int i=0; i< nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Duplicate(nums));
    }

    public static boolean Duplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}