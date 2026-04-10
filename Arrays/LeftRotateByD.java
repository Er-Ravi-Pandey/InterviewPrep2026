package com.DSA.Arrays;

public class LeftRotateByD {
    public static void main(String[] args) {
        int a[]={3,5,6,7,9,0};
        leftRotateByD(a,2);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);

        }
    }

    public static int[] leftRotateByD(int a[],int d){
       int n=a.length;
       d=d%n;

       int temp[]=new int[d];

       for(int i=0 ;i<d ;i++){
           temp[i]=a[i];
       }

       for(int i= d; i<n;i++){
           a[i-d]=a[i];
       }

       for(int i=n-d;i<n;i++){
           a[i]=temp[i-(n-d)];
       }


        return a;
    }
}
