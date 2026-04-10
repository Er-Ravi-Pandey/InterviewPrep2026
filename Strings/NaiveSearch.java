package com.DSA.Strings;

//Java program for Naive Pattern Searching
public class NaiveSearch {

	public static void search(String txt, String pat)
	{
		int M = pat.length();
		int N = txt.length();

		/* A loop to slide pat one by one */
		for (int i = 0; i <= N - M; i++) {

			int j;

			/* For current index i, check for pattern
			match */
			for (j = 0; j < M; j++)
				if (txt.charAt(i + j) != pat.charAt(j))
					break;

			if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
				System.out.println("Pattern found at index " + i);
		}
	}

	public static void main(String[] args)
	{
		String txt = "AABAACAADAABAAABAA";
		String pat = "AABA";
		search(txt, pat);
	}

    public static class PermutationOFString {


            // Function to print permutations of the string
            // This function takes two parameters:
            // 1. String
            // 2. Starting index of the string.
            static void permute(StringBuilder s , int left , int right) {

                // Base case
                if (left == right) {
                    System.out.println(s);
                    return;
                }

                for (int i = left; i < right; i++) {

                    // Swapping
                    swap(s, left , i);

                    // First idx+1 characters fixed
                    permute(s, left +1, right);

                    // Backtrack
                    swap(s, left, i);
                }
            }


            // Helper function to swap characters in the StringBuilder
            static void swap(StringBuilder s, int i, int j) {
                char temp = s.charAt(i);
                s.setCharAt(i, s.charAt(j));
                s.setCharAt(j, temp);
            }

            public static void main(String[] args) {
                StringBuilder s =new StringBuilder( "1234");
                int left =0;
                int right=s.length();
                permute(s,left,right);
            }
        }
}

