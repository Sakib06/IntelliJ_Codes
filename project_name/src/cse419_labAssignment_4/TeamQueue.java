package cse419_theoryAssignment_1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TeamQueue {
    public static void main (String [] args) throws IOException {
//        FileReader fr = new FileReader("C:\\Users\\ASUS\\Dropbox\\My PC (LAPTOP-0V7ST4UU)\\Desktop.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = 1;
        String s;
        while (!(s=br.readLine()).equals("0")) {
            int [] team = new int [Integer.parseInt(s)];
            HashMap<String,Integer> teamId = new HashMap<>();
            for (int i=0; i<team.length; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int count=Integer.parseInt(st.nextToken());
                for (int j=0; j<count; j++) teamId.put(st.nextToken(),i);
            }

            StringBuilder sb=new StringBuilder();
            sb.append("Scenario #"+testCase++); sb.append("\n");

            LinkedList<LinkedList<String>> teamQueue = new LinkedList<>();
            boolean [] teamQueueContains = new boolean [team.length];
            LinkedList<String> [] elementQueue = new LinkedList [team.length];
            for (int i=0; i<elementQueue.length; i++) elementQueue[i]=new LinkedList<>();

            while (!(s=br.readLine()).equals("STOP")) {
                StringTokenizer st = new StringTokenizer(s);
                String op=st.nextToken();
                if (op.equals("ENQUEUE")) {
                    String elementToAdd = st.nextToken();
                    int tid=teamId.get(elementToAdd);
                    elementQueue[tid].addLast(elementToAdd);

                    if (!teamQueueContains[tid]) {
                        teamQueue.addLast(elementQueue[tid]);
                        teamQueueContains[tid] = true;
                    }
                } else if (op.equals("DEQUEUE")) {
                    LinkedList<String> firstElementQueue=teamQueue.peekFirst();
                    if (firstElementQueue.size() == 1) {
                        teamQueueContains[teamId.get(firstElementQueue.peekFirst())] = false;
                        teamQueue.removeFirst();
                    }
                    sb.append(firstElementQueue.removeFirst());
                    sb.append("\n");
                }
            }
            System.out.println(sb.toString());
        }
    }
}