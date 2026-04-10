package com.DSA.Arrays;

import java.util.Arrays;

public class RearrangeNegPos {
    public static void main(String[] args) {
        int a[]={-5,7,66,-4,-8-2,2,4};
        int n=a.length;
        rearrange(a,n);

    }

    public static int[] rearrange(int a[], int n) {

        int res[]=new int[n];

        int even=0,odd=1;
        for(int i=1;i<n;i++){

            if(a[i]<0){
                res[odd]=a[i];
                odd=odd+2;
            }else{
                res[even]=a[i];
                even=even+2;
            }
        }

        System.out.println(Arrays.toString(res));

        return res;
    }
}
