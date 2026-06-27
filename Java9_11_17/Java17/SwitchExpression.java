package com.DSA.Java9_11_17.Java17;

public class SwitchExpression {

    public static void main(String[] args) {


        int day = 1;

        switch (day) {

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");

        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("Weekday");
            }

            case 6, 7 -> {
                System.out.println("Weekend");
            }

            default -> {
                System.out.println("Invalid day");
            }
        }

//Suppose one case needs multiple statements
        String message = switch (day) {

            case 1 -> {

                System.out.println("Working Day");

                yield "Monday"; //"Return this value from the switch expression."
            }

            default -> "Holiday";
        };

//Some real world use case
        int StatusCode = 3;
        String status = switch (StatusCode) {

            case 1 -> "Placed";

            case 2 -> "Packed";

            case 3 -> "Shipped";

            case 4 -> "Delivered";

            default -> "Unknown";
        };
    }
    //No break
        //No fall-through
        //Cleaner syntax

        /*Interview Questions
Q1. Why were Switch Expressions introduced?

Answer:

To make switch statements more concise, eliminate accidental fall-through, and allow a switch to return a value.

Q2. Difference between Switch Statement and Switch Expression?
Switch Statement	Switch Expression
Doesn't return a value	Returns a value
Usually needs break	Uses ->; no break needed
Fall-through possible	No fall-through with ->

Q3. What is yield?

Answer:

yield returns a value from a block inside a switch expression.

Q4. When is yield required?

When a case uses a block ({ ... }) with multiple statements and needs to produce a value.

Q5. Why is default often required?

Because a switch expression must be exhaustive—it must be able to produce a value for every possible
 input unless the compiler can prove all possibilities are already covered.*/
}
