package com.DSA.Arrays;

public class RemoveElement {


        static int removeElement(int[] arr, int val) {
            int i =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=val){
                    arr[i]=arr[j];
                    i++;
                }
            }
            return i;
            }


    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr,2));

         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]);
         }
    }

    }

