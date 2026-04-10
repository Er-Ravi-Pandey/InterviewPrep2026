package com.DSA.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int a1[]={1,1,3,4,5};
        int a2[]={1,2,3,4,5};

        int m=a1.length,n=a2.length;

        intersectionArray(a1,a2,m,n);

    }

    public static int[] intersectionArray(int a1[],int a2[],int m,int n){

        int i=0;
        int j=0;
        Set<Integer> set=new HashSet<>();
        while (i < m && j < n) {
            if (a1[i] < a2[j]) {
                i++;
            } else if (a1[i] > a2[j]) {
                j++;
            } else {
                set.add(a1[i]);
                i++;
                j++;
            }
        }


        int intersection[]=new int[set.size()];

        int k = 0;
        for (Integer x : set)
            intersection[k++] = x;

        System.out.println(Arrays.toString(intersection));
        return intersection;}

}

