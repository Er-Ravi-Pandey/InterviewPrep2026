package com.DSA.Java9_11_17.Java17;

public record Employee(int id, String name) {
    // The record automatically generates the constructor, accessors, equals, hashCode, and toString methods.


   // private int salary; // This will cause a compilation error because records cannot have instance fields.
//Instead of writing 40–50 lines each time, Java lets you write
//
//public record Employee(int id, String name) {
//}


  //  Can Records have methods?

   //     Yes.
    public String greeting(){

        return "Hello " + name;
    }

    /*Can Records implement interfaces?

    Yes.

    interface Printable{
        void print();
    }

    record Employee(int id,String name)
            implements Printable{

        @Override
        public void print(){

            System.out.println(name);
        }
    }




    Can Records extend classes?

No.

This is illegal.

class Person{

}

record Employee(int id,String name)
extends Person{
}Limitations
1. Immutable

Fields are final.

Not allowed

employee.id = 20;
2. Cannot extend another class

Only

extends Record
3. Cannot declare instance fields

Wrong

record Employee(int id){

    private int salary;
}

Compilation error.

Static fields are allowed.



POJO	                Record
More boilerplate	Very concise
Mutable by default	Immutable by default
Getters	Accessor methods (id())
Manual equals()	Auto-generated
Manual hashCode()	Auto-generated
Manual toString()	Auto-generated
Can extend classes	Cannot extend classes
Best for entities/business objects	Best for DTOs/value objects




 Interview Questions
Q1. Why were Records introduced?

Answer:

To reduce boilerplate code for immutable data carrier classes by automatically generating constructors, accessors, equals(), hashCode(), and toString().

Q2. Are Records immutable?

Answer:

Yes. Their components are final, so their references cannot be reassigned. However, if a component refers to a mutable object (like a List), that object can still be modified unless you make defensive copies.

Q3. Can Records extend another class?

Answer:

No. Every record implicitly extends java.lang.Record.

Q4. Can Records implement interfaces?

Answer:

Yes.

    Q6. When would you use a Record instead of a POJO?

Answer:

Use a Record when the object's primary purpose is to carry immutable data, such as DTOs, API request/response models, configuration values,
or value objects.
Use a regular POJO when you need mutable state, inheritance, or richer business behavior



Before Java Records

Most Java projects used Lombok.

import lombok.Data;

@Data
public class Employee {

    private int id;
    private String name;
}

Lombok generates:

Getters
Setters
equals()
hashCode()
toString()
Required constructor (depending on annotations)

So yes, it removes boilerplate.

Java Record
public record Employee(int id, String name) {}

Java itself generates:

Constructor
Accessor methods
equals()
hashCode()
toString()

No external library is needed.

The biggest difference
@Data creates a mutable class
@Data
class Employee {

    private int id;
    private String name;
}

You can do:

Employee e = new Employee();

e.setId(10);

e.setName("Ravi");

e.setName("Rahul");   // Allowed

The object can change throughout its lifetime.

Record is immutable
record Employee(int id, String name){}
Employee e = new Employee(10,"Ravi");

// Not allowed

e.id = 20;

No setters exist.

Once created, it cannot be modified.

Another important difference
Lombok

Requires

lombok.jar

and IDE support.

Without Lombok, the compiler doesn't know what @Data means.

Record

Built into Java.

No dependency.

No annotation processing.

Every Java 17 compiler understands it.

Can Lombok make immutable classes?

Yes.

Instead of

@Data

you can write

@Value
public class Employee {

    int id;
    String name;
}

@Value creates an immutable class.

Even then, a Record is still more concise.

Records have language-level semantics

A Record tells Java:

"This class is a transparent carrier for immutable data."

Because of that, the JVM, compiler, and libraries understand its intent.

Lombok just generates code during compilation—it doesn't change the language semantics.

Spring Boot example
DTO using Lombok
@Data
public class UserResponse {

    private Long id;
    private String name;
}
DTO using Record
public record UserResponse(
        Long id,
        String name
) {}

The Record is shorter, immutable, and communicates that it's just a data carrier.

Which one should you use?
Use Records for:
DTOs
API request/response models
Configuration objects
Value objects
Use Lombok (@Data or other annotations) for:
Mutable domain models
Classes that require setters
Legacy codebases
Situations where frameworks expect mutable JavaBeans

Records are ideal for immutable data carrier classes and are part of the Java language.
 Lombok is still useful because it supports many features beyond boilerplate reduction, such as builders (@Builder), logging (@Slf4j),
  constructors (@AllArgsConstructor, @NoArgsConstructor), and it can simplify mutable classes as well.
 They solve overlapping problems, but they're not replacements for each other.

*/
}