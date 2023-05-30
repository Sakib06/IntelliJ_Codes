package cse419_labAss_3;

import java.util.Scanner;
import java.util.ArrayList;

public class backToUnderworld {
    static ArrayList<Integer>g[]=new ArrayList[20005];
    static boolean vis[]=new boolean[20005];
    static int xx,yy;

    static void dfs(int source, boolean p)
    {
        if(vis[source]==true)
            return;
        vis[source]=true;
        if(p)
            xx++;
        else
            yy++;
        int sz=g[source].size();
        for(int i=0;i<sz;i++)
            dfs(g[source].get(i),!p);
        return;
    }

    public static void main(String[] args)
    {
        for (int i=0; i<20005; i++)
            g[i] = new ArrayList<>();

        Scanner s=new Scanner(System.in);
        int t,n,a,b;
        t=s.nextInt();
        for(int i=1;i<=t;i++)
        {
            for(int j=0;j<20005;j++)
                g[j].clear();

            for(int j=0;j<20005;j++)
                vis[j]=false;

            n=s.nextInt();

            for(int j=1;j<=n;j++)
            {
                a=s.nextInt();
                b=s.nextInt();
                g[a].add(b);
                g[b].add(a);
            }

            int ans=0;
            for(int j=1;j<20005;j++)
                if(vis[j]==false && !g[j].isEmpty())
                {
                    xx=yy=0;
                    dfs(j,true);
                    ans+=Math.max(xx,yy);
                }
            System.out.println("Case "+i+": "+ans);
            System.gc();
        }
        System.gc();
        s.close();
    }
}
