package com.DSA.StackSQueues;

import java.util.Stack;

class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[]=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int pop=st.pop();

                res[pop]= i-pop;
            }
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        DailyTemperatures solution = new DailyTemperatures();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = solution.dailyTemperatures(temperatures);

        System.out.print("Days until warmer temperature: ");
        for (int days : result) {
            System.out.print(days + " ");
        }
    }
}
