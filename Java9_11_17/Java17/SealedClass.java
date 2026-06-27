package com.DSA.Java9_11_17.Java17;

//public sealed class SealedClass permits CreditCard, DebitCard {
    // This class can only be extended by CreditCard and DebitCard classes.
    //Problem: Java (before sealed classes) couldn't restrict who was allowed to extend your class.

    /*What must permitted subclasses do?

Every permitted subclass must declare one of three modifiers:

final
sealed
non-sealed

This is mandatory.

1. final

Inheritance stops here.

sealed class Animal
    permits Dog {

}

final class Dog extends Animal {

}

Now

class Labrador extends Dog {}

❌ Compilation error.

Think of it like:

Animal
   |
 Dog (final)

End



2. sealed

Suppose you still want controlled inheritance.

sealed class Animal
    permits Dog {

}

Dog itself becomes sealed.

sealed class Dog
        extends Animal
        permits Labrador, Pug {

}

Now only

Labrador
Pug

can extend Dog.

Tree:

Animal

   |

 Dog

 /   \

Lab   Pug

Still controlled.

3. non-sealed

This means:

"I was sealed by my parent, but from me onward, inheritance is open again."

Example

sealed class Animal
    permits Dog {

}

non-sealed class Dog
        extends Animal {

}

Now

class Labrador extends Dog {}

class Pug extends Dog {}

class GermanShepherd extends Dog {}

Everything is allowed.

The seal ends at Dog.

Benefits

1. Controlled inheritance

Only approved classes can extend or implement the sealed type.

2. Better readability

When you see:

sealed class Payment
    permits CreditCard, UPI

you immediately know all valid implementations.

3. Better compiler support

Since the compiler knows all subclasses, it can help with features like switch expressions (which we'll study next).

4. Better API design

Framework and library authors can expose only the extension points they intend.

Interview Questions
Q1. Why were Sealed Classes introduced?

Answer:

To allow controlled inheritance by restricting which classes can extend or implement a class or interface.

Q2. Difference between final and sealed?

Answer:

final → No subclass is allowed.
sealed → Only specific subclasses listed in permits are allowed.
Q3. What is permits?

Answer:

It specifies the exact classes that are allowed to inherit from a sealed class or implement a sealed interface.

Q4. What is non-sealed?

Answer:

It removes the restriction for that subclass, allowing it to be extended freely.

Q5. Can interfaces be sealed?

Yes.

sealed interface Shape
    permits Circle, Rectangle {

}
Quick Comparison
Modifier	Meaning
final	No subclass allowed
sealed	Only listed subclasses allowed
non-sealed	Opens inheritance again


*/

