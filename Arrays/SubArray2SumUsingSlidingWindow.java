package com.DSA.Arrays;


import java.util.Arrays;

public class  SubArray2SumUsingSlidingWindow {

        static int [] subArray2Sum(int[] arr,int target ){
            Arrays.sort(arr);
            int i=0;
            int j = arr.length-1;
            int result[]=new int[2];
            while(i<j){
                int sum=arr[i]+arr[j];
                if(sum==target){
                  result[0]=arr[i];
                  result[1]=arr[j];
                  return result;
                }
                else if(sum<target){
                    i++;
                }
                else {
                    j--;
                }


            }

            throw new IllegalArgumentException("Two numbers are not found");
        }
        public static void main(String[] args) {
            int arr[]={2,11,5,10,7,8};
            int results[]=subArray2Sum(arr,9);
            System.out.print("Two indices are " + results[0] +" & " + results[1]);
        }
    }


