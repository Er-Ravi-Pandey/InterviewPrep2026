package com.DSA.Java9_11_17.Java17;

public class InstanceOf {

    /*
    if (obj instanceof String) {
    String str = (String) obj;
}

you write:

if (obj instanceof String str) {
    System.out.println(str.length());
}

No cast.

Cleaner.

Safer.

    Object obj = "Hello, World!";

    if (obj instanceof String str){
        System.out.println(str.length());
    }

    Object obj2 = 100;

if (obj2 instanceof Integer number) {
        System.out.println(number + 50);
    }

    Interview Questions
Q1. Why was Pattern Matching for instanceof introduced?

Answer:

To remove the need for explicit casting after an instanceof check, making the code shorter, safer, and easier to read.

Q2. Does it replace instanceof?

No.

It enhances instanceof.

Q3. Is casting still required?

No.

The compiler performs the cast automatically when the check succeeds.

Q4. What is the scope of the pattern variable?

Only where the compiler can guarantee the pattern has matched, such as inside the if block and the right-hand side of a && expression after the successful match.

Q5. Does it improve performance?

Not significantly.

Its primary purpose is better readability and type safety, not speed.

Before vs After
Before
if (obj instanceof String) {

    String str = (String) obj;

    System.out.println(str.length());

}
After
if (obj instanceof String str) {

    System.out.println(str.length());

}
One thing to remember for interviews

An interviewer might ask:

"Is Pattern Matching just syntactic sugar?"

A good answer is:

"Yes, in this case it primarily reduces boilerplate. The compiler still performs the type check and cast, but it does so automatically and safely. The main benefits are readability, maintainability, and avoiding unnecessary explicit casts."

Practice

Without looking back, try converting this old code to the new syntax:

Object obj = new Integer(100);

if (obj instanceof Integer) {
    Integer num = (Integer) obj;
    System.out.println(num * 2);
}

If you can rewrite it correctly in one attempt, you've mastered this feature. After that, we'll move on to Switch Expressions, which build nicely on some of the ideas you've just learned.
     */
}
