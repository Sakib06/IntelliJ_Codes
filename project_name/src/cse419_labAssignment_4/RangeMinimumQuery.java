package cse419_theoryAssignment_1;

import java.util.Scanner;

public class RangeMinimumQuery {
    int [] tree;
    private final int INF=Integer.MAX_VALUE-1;
    private final int STARTINDEX=0;
    private int ENDINDEX;
    void RangeMinQuery(int size)
    {
        ENDINDEX=size-1;
        int height=2*(int)Math.pow(2,Math.ceil(Math.log(size)/Math.log(2)));
        tree=new int[height];
        for(int i=0;i<height;i++)tree[i]=INF;
    }

    public RangeMinimumQuery(int endindex) {
        ENDINDEX = endindex;
    }

    private void buildTree(int [] a,int left,int right,int root)
    {
        if(left==right)
        {
            tree[root]=a[left];return;
        }
        int mid=(left+right)/2;
        buildTree(a,left,mid,2*root+1);
        buildTree(a,mid+1,right,2*root+2);
        tree[root]=Math.min(tree[2*root+1],tree[2*root+2]);
    }
    private int query(int []a,int qs,int qe)
    {
        return queryUtil(a,STARTINDEX,ENDINDEX,qs,qe,0);
    }
    private int queryUtil(int [] a,int l,int r,int qs,int qe,int root)
    {
        int left=2*root+1,right=left+1;
        if(l>=qs && r<=qe)return tree[root];
        if(l>qe || r<qs)return INF;
        int mid=(l+r)/2;
        return Math.min(queryUtil(a,l,mid,qs,qe,left),queryUtil(a,mid+1,r,qs,qe,right));
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,q;
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        System.out.println("Enter the number of queries");
        q=sc.nextInt();
        System.out.println("Enter the elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        RangeMinimumQuery segmentTree=new RangeMinimumQuery(n);
        segmentTree.buildTree(a,0,n-1,0);
        for(int i=0;i<q;i++)
        {
            System.out.println("Enter the ranges");
            int l,r;
            l=sc.nextInt();
            r=sc.nextInt();
            System.out.println(segmentTree.query(a,l,r));
        }
    }
}

