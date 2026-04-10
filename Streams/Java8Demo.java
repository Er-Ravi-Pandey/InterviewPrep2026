package com.DSA.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;


/* Java 8 Full Code inside this class */
public class Java8Demo {
    public static void main(String[] args) {
        //streams
        //Java8 --> minimal code and functional programming

        //lambda expression is anonymous function (no name , no return type ,no access modifiers)
        //lambda expression is used to create functional interface by implementing abstract methods

        Thread t1 = new Thread(() -> {
            System.out.println("hello");
        });

        Mathoperation sum = (a, b) -> a + b;
        Mathoperation sub = (a, b) -> a - b; //this is functional programming
        Mathoperation mul = (a, b) -> a * b;
        Mathoperation div = (a, b) -> a / b;
        System.out.println(sum.operation(2, 3));


        //Predicate --> functional interface (boolean valued function , it simply hold true or false with a condition)
        //Predicate has functional interface method test()
        Predicate<Integer> isEven = x -> x % 3 == 0;
        System.out.println(isEven.test(3));

        Predicate<String> isStartWith = x -> x.startsWith("R");
        System.out.println(isStartWith.test("Ravi"));
        Predicate<String> isEndWith = x -> x.endsWith("i");
        System.out.println(isEndWith.test("Ravi"));

        Predicate<String> compare = isStartWith.and(isEndWith);
        System.out.println(compare.test("Ravi"));

        //negate in Predicate
        System.out.println(compare.negate().test("Ravi"));

        //equal in Predicate
        Predicate<Object> equal = Predicate.isEqual("Ravi");
        System.out.println(equal.test("Ravi"));


        //Function  --> work for you
        //Function has functional interface method apply(T,U)

        Function<String,Integer> length = x -> x.length();
        System.out.println(length.apply("Ravi"));

        Function<String,String> reverse = x -> new StringBuilder(x).reverse().toString(); //reverse the string>
        Function<String,String> upperCase = x -> x.toUpperCase();
        Function<String,String> lowerCase = x -> x.toLowerCase();
        Function<String,String> substring = x -> x.substring(1,3);
        System.out.println(substring.apply("Ravi"));
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        System.out.println(doubleIt.apply(100));

        //Writing a function to return a Student which starts with VIP
        
//        Function<List<Student>, List<Student>> studentWithVipAsPrefix=lis ->{
//            List<Student> result = new ArrayList<>();
//            for(Student s : lis){
//                if(substring.apply(s.getName()).equalsIgnoreCase("VIP")){
//                   result.add(s);
//                }
//                }return lis;
//            };
//         Student s1=new Student("Ravi", 8.9);
//        Student s2 =  new Student("Rohit", 8.9);
//        Student s3 =new Student("Rahul", 8.7);
//        }
//
        
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(tripleIt.apply(100));

        //this is called Function Chaining
        System.out.println(doubleIt.andThen(tripleIt).apply(100));


        //does same just we use different order
        System.out.println(tripleIt.compose(doubleIt).apply(100));


        //it just return the same which is provided so the use ? it is used in streams
        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(100));





        //Consumer --> this only consume the data and does not return anything hence it has single parameter
        //it has a method name accept
        Consumer<String> print = System.out::println;
        print.accept("hello");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Consumer<List<Integer>> printList = x -> {
            for (int i : x) System.out.println(i);
        };

        printList.accept(list);







        //Supplier  --> return something

        Supplier<String> name = () -> "Ravi";
        System.out.println(name.get());
        Supplier<Integer> random = () -> (int) (Math.random() * 100);
        System.out.println(random.get());




        //BiPredicate , BiConsumer , BiFunction --> it takes two parameters unlike predicate which takes single parameter

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a + b) % 2 == 0;
        boolean result = biPredicate.test(2, 4);
        System.out.println(result);

        BiPredicate<String,Integer> biPredicate1 = (a, b) -> a.length() == b;
        boolean result1 = biPredicate1.test("Ravi", 4);
        System.out.println(result1);

        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("hello", "world"));

        //there is no biSupplier as it is not needed in streams

        //UrnaryOperator --> it takes of same type single parameter integer and return same type single parameter integer

        //it is special case of writing a Function having same input n output type

        Function<Integer, Integer> square = x -> x * x;
        //Same as above so we can use UnaryOperator
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(10));

        UnaryOperator<String> unaryOperator1 = x -> x.toUpperCase();
        System.out.println(unaryOperator1.apply("hello"));

        //BinaryOperator --> it takes of same type two parameter integer and return same type single parameter integer

        BiFunction<String,String,String> biFunction1 = (x, y) -> x + y;
        System.out.println(biFunction1.apply("hello", "world"));
        //Same the above code can be written using BinaryOperator
        BinaryOperator<String> binaryOperator1 = (x, y) -> x + y;
        System.out.println(binaryOperator1.apply("hello", "world"));


        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
        System.out.println(binaryOperator.apply(10, 20));

        //Method reference --> use method without invoking and used in placce of lambda expression

        List<String> names = Arrays.asList("Ram", "Shyam", "GhanShyam");
        names.forEach(x -> System.out.println(x));
        //through method reference
        names.forEach(System.out::println);




        //constructor reference
        List<String> listphone = Arrays.asList("Nokia", "Samsung", "iphone");

       // List<MobilePhone> collect = listphone.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
        List<MobilePhone> collect = listphone.stream().map(MobilePhone::new).collect(Collectors.toList());


    }
}

class Student{
    int rollNo;
    String name;

    public Student(String ravi, double v) {
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

    class MobilePhone{
        String mobile;

        public MobilePhone(String mobile) {
            this.mobile = mobile;
        }
    }

    interface Mathoperation {
        int operation(int a, int b);
    }

