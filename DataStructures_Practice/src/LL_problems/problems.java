/* QUESTION:
Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
Delete all nodes which have values greater than 25.
 */
package LL_problems;

import java.util.*;

public class problems {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList();

        for(int i=0; i<5; i++){
            int element = sc.nextInt();
            list.add(element);
        }

        list.removeIf(n -> n > 25);

        System.out.print(list);

    }
}
