package com.DSA.Arrays;

public class SecondMaxArray {

    static int secondMax(int arr[]){
        int max=Integer.MIN_VALUE; //assigning minimun possible value of Integer data type
        int secondMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;
        for(int i=0;i < arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if (arr[i]>secondMax && arr[i]!=max) {
                thirdMax=secondMax;
                secondMax=arr[i];
            } else if(arr[i]>thirdMax && arr[i]!=secondMax){
                thirdMax=arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args){
        int arr[]={13,34,2,34,3,33,1,14,14};
        System.out.println("Second Maximum value is "+ secondMax(arr));

    }
}
