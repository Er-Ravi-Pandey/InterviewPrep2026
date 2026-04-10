package com.DSA.Arrays;

import java.util.Arrays;

class ThirdMax {

    public static void thirdMax(int[] nums) {

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;

        int temp=0;
///
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                nums[index++] = nums[i];

            }


        }
        int sums[]= Arrays.copyOf(nums, index);



//
        for(int i=0;i < sums.length;i++){

            if(sums[i] > max && sums.length<=2){
                max=sums[i];
                temp=max;
            }
            else if(sums[i]>max){
                secondMax=max;
                max=sums[i];

            }
            else if (sums[i]>secondMax && sums[i]!=max) {

                thirdMax=secondMax;
                secondMax=sums[i];

            } else if(sums[i]>thirdMax && sums[i]!=secondMax && sums[i]!=max ){
                thirdMax=sums[i];
                temp=thirdMax;
            }

        }
        System.out.print(thirdMax);

    }

    public static void main(String[]args){
        int nums[]={1,2,5,3,5,6,4,3,2,1};
        thirdMax(nums);
    }
}