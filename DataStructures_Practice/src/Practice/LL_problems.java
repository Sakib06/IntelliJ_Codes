/* QUESTION:
Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
Search for the number 7 & display its index.
 */

import java.util.*;

public class LL_problems {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 7; i++) {
            list.add(sc.nextInt());
        }

        for (int j=0; j<7; j++) {
            System.out.print(list.get(j) + ", ");
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i) == 7)
                System.out.println("Index of number 7 is: " + i);
        }
    }
}
