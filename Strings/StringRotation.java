package com.DSA.Strings;

public class StringRotation {

    public static boolean isRotatedByTwoPlaces(String s1, String s2) {
        // Check if both strings are of the same length
        if (s1.length() != s2.length()) {
            return false;
        }

        // Rotate s1 by two places to the right
        String rotatedRight = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);
         System.out.print(rotatedRight);
        // Rotate s1 by two places to the left
        String rotatedLeft = s1.substring(2) + s1.substring(0, 2);
        System.out.println(rotatedLeft);
        // Check if s2 is either of the rotated strings
        return s2.equals(rotatedRight) || s2.equals(rotatedLeft);
    }

    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "efabcd";  // rotated by two places to the right
        System.out.println(isRotatedByTwoPlaces(s1, s2));  // Output: true

        s2 = "cdefab";  // rotated by two places to the left
        System.out.println(isRotatedByTwoPlaces(s1, s2));  // Output: true

        s2 = "abcfed";  // not a rotation by two places
        System.out.println(isRotatedByTwoPlaces(s1, s2));  // Output: false
    }
}

