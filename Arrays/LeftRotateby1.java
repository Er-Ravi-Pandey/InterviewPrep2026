package com.DSA.Arrays;

public class LeftRotateby1 {
    public static void main(String[] args) {
        int a[]={5,8,9,6,8};
        leftRotate(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
      public static int[] leftRotate(int[] a){
      int temp=a[0];
      int n=a.length;
      for(int i=1;i<n;i++){
          a[i-1]=a[i];
      }
      a[n-1]=temp;

          return a;
      }
}


