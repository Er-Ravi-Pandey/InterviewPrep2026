package com.DSA.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashMapDemo {
    public static  void main(String[] args) {

        //HashMap is one of the implementation of Map interface
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ravi");
        map.put(2, "Vijay");
        map.put(3, "Ajay");
        map.put(null, "Vipul");
        //O(1) complexity for put
        System.out.println(map);

        String s = map.get(3);

        System.out.println(s);

        System.out.println(map.containsKey(3));    //O(1) complexity in HashMap Optimization
        System.out.println(map.containsValue("Vijay"));

        //   Set<Integer> keys = map.keySet();
        for (Integer key : map.keySet()) {  //O(1)
            System.out.println(key + " " + map.get(key));


            //   Set<Map.Entry<Integer, String>> entry=map.entrySet();
            for (Map.Entry<Integer, String> e : map.entrySet()) {
                System.out.print(e.getKey() + " " + e.getValue());
            }

            //to Upper Case
            for (Map.Entry<Integer, String> e : map.entrySet()) {
                System.out.println(map.put(e.getKey(), e.getValue().toUpperCase()));
            }
        }

        // hashmap unordered
        //Allows only one null key and multiple null values
        //Not Synchronized ,not thread safe
        //Performance is better than Hashtable
        //Performance : offers constant time performance for the basic operations (such as put and get),
        // assuming the hash function disperses the elements properly among the buckets.

        //Internal Structure of HashMap

        //It uses a hash table where key-value pairs are stored in buckets (an array of buckets) to map keys to values.
        //Hashfunction is used to map keys to buckets,
        // -converts a key to an index in the hash table for storing the key-value pair.
        //hashfunction pulls key from the index of the array


        // A hashfunction is an algorithm that takes an input ("Key")
        //typically a 32-bit integer.The output is called hash value or hash code.
        //the primary purpose of a hashfunction is to map data of arbitrary size to a fixed size.

        //HashFunction
        //Deterministic : it returns same output for same input
        //Fixed Output size : it returns fixed size output for same input, hashcode has a consistent size for same input(32 bits or 64bits)
        //Efficient Computation : it takes O(1) time to compute hashcode , hash function should compute the hashcode quickly.


        //How data is stored in HashMap

        //Step 1 Hashing the key
//        First , the key is passed through a hash function to produce a unique hash code.(an integer value).
//        this hash code is used to determine which bucket the key-value pair will be stored in the array of buckets
//
        //Step 2 Calculating the index
        // The hashcode is then used to calculate the index of the bucket where the key-value pair will be stored.
        // int index=hashcode%array.length;
        //the index decides which bucket the key-value pair will be stored in.

        //Step 3 Storing the key-value pair in bucket
        //The key-value pair is stored in the bucket at the calculated index


        //How hashmap retrieves data
        //when we call getKey()
        //Step 1 Hashing the key : similar to insertion , the key is hashed using the same hash function to calculate the hashcode
        //Step 2 Finding the index : the hashcode is used to calculate the index of the bucket where the key-value pair is stored
        //Step 3 Searching the bucket : Once the index is calculated, the key-value pair is searched in the bucket at the calculated index


        //Handling collision
        //when array store multiple values for same key in which same hashcode is generated then it is called collision
        //Suppose corresponding k1,V1 and k2,V2 are stored in same bucket then it is called collision
        //then in that case linkedlist comes in picture where Key1 is linked to Key2 and value1 is linked to value2
        //this is called chaining , pointer to next node in case of collision.


        //Since different keys can have same index(called a collision),
        //HashMap used a technique to handle this situation. Java's HashMap uses Linkedlist(or balanced trees after Java 8) for this.
        //If multiple key-value pairs have the same hashcode, they are stored in a linkedlist or Balanced tress after Java 8
        //Collision is very rare to happen.
        //For more optimization when search operation goes for O(n) in linkedlist we use binary search tree.
        //After Java 8 we use Red-Black tree when buckets are more than 8.
        //The Red-Black tree is a self-balancing binary search tree that is used to implement
        // HashMap in Java 8 and later versions of Java.
        //Red-Black tree is a self-balancing binary search tree that is used to implement HashMap in Java 8
        // and later versions of Java.

        //Only after threashold of 8 we use Red-Black tree


        //HashMap Resize
        //If the number of elements stored in the HashMap exceeds the threshold of 0.75,
        //the HashMap is resized to a larger capacity.

        //HashMap has an initial capacity array size  of 16 and a load factor of 0.75.
        //If the number of elements stored in the HashMap exceeds the threshold of 0.75,
        //the HashMap is resized to a larger capacity.
        //The load factor is the ratio of the number of elements to the capacity of the HashMap.
        //If the load factor exceeds the threshold of 0.75, the HashMap is resized to a larger capacity.


        //After reHashing the new Array is created with new capacity
        //All the elements are copied to the new Array
        //The old Array is replaced with the new Array


        //Time Complexity
        //Insertion : O(1) in average case , O(n) in worst case
        //Search : O(1) in average case , O(n) in worst case
        //Deletion : O(1) in average case , O(n) in worst case


        HashMap<com.DSA.Collections.Person, Integer> map1 = new HashMap<>();
        Person p1 = new Person("Ravi", 25);
        Person p2 = new Person("Saurabh", 25);
        Person p3 = new Person("Ravi", 25);

        map1.put(p1, 1000); //hashcode of p1 is index  1
        map1.put(p2, 2000); //hashcode of p2 is index 2
        map1.put(p3, 1000); //hashcode of p3 is index 3 is not equal to hashcode of p1 so it will be stored in index 3 because of customer class
        //obejects are not equal

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Ravi", 1000);  //hashcode1 -->index 1
        map2.put("Saurabh", 2000); //hashcode2 -->index 2
        map2.put("Ravi", 1000); //hashcode3 -->index 1  --> equal to hashcode1 so it -->replace

        //now in custom object it consider as different object while "Ravi" and "Ravi" are equal so to
        //get this fixed we need to override equals method in custom class as shown below.


        System.out.println("map size" + map1.size());
        System.out.println("value of p1 " + map1);




    }
}
    class Person {
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        int age;


        public Person() {
            super();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }


        @Override
        public boolean equals(Object obj) {
            if(this==obj){ return true;}

            if(obj == null){
                return false;
            }
            if(getClass() != obj.getClass()){return false;}

            Person person = (Person)obj;

            return person.name.equals(name) && person.age==person.getAge() && Objects.equals(name, person.getName()) && Objects.equals(age, person.getAge());

        }


        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }


        @Override
        public String toString() {
            return super.toString();
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

}