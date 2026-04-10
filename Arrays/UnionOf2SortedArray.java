package com.DSA.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOf2SortedArray {

    public static void main(String[] args) {
        int a1[]={1,1,3,4,5};
        int a2[]={1,2,3,4,5};

        int m=a1.length,n=a2.length;

        unionArray(a1,a2,m,n);

    }

    public static int[] unionArray(int a1[],int a2[],int m,int n){

        int i=0;
        int j=0;
        Set<Integer> set=new HashSet<>();
           for(i=0;i<m;i++){
                set.add(a1[i]);
            }
            for(j=0;j<n;j++){
                set.add(a2[j]);
            }
        int union[]=new int[set.size()];

        int k = 0;
        for (Integer x : set)
            union[k++] = x;

        System.out.println(Arrays.toString(union));
        return union;}

}
