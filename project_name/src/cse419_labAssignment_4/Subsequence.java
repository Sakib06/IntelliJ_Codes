package cse419_theoryAssignment_1;
import java.math.BigDecimal;
import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            String str, sub;
            str = sc.next();
            sub = sc.next();
            BigDecimal[] dp = new BigDecimal[str.length()+1];
            Arrays.fill(dp, BigDecimal.valueOf(1));
            for(int j=0; j<sub.length(); j++){
                char c1=sub.charAt(j);
                BigDecimal[] dpNext = new BigDecimal[str.length()+1];
                dpNext[0] = BigDecimal.valueOf(0);
                for(int k=0; k<str.length(); k++){
                    char c2=str.charAt(k);
                    dpNext[k+1] = BigDecimal.valueOf(0);
                    if(c1 == c2) {
                        dpNext[k+1] = dpNext[k+1].add(dp[k]);
                    }
                    dpNext[k+1] = dpNext[k+1].add(dpNext[k]);
                }
                dp = dpNext;
            }
            System.out.println(dp[str.length()]);
        }
    }
}