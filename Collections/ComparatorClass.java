package com.DSA.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class StringLengthComparator implements Comparator<String> {

    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.<p>
     * <p>
     * The implementor must ensure that {@link Integer#signum
     * signum}{@code (compare(x, y)) == -signum(compare(y, x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * compare(x, y)} must throw an exception if and only if {@code
     * compare(y, x)} throws an exception.)<p>
     * <p>
     * The implementor must also ensure that the relation is transitive:
     * {@code ((compare(x, y)>0) && (compare(y, z)>0))} implies
     * {@code compare(x, z)>0}.<p>
     * <p>
     * Finally, the implementor must ensure that {@code compare(x,
     * y)==0} implies that {@code signum(compare(x,
     * z))==signum(compare(y, z))} for all {@code z}.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     * @throws NullPointerException if an argument is null and this
     *                              comparator does not permit null arguments
     * @throws ClassCastException   if the arguments' types prevent them from
     *                              being compared by this comparator.
     * @apiNote It is generally the case, but <i>not</i> strictly required that
     * {@code (compare(x, y)==0) == (x.equals(y))}.  Generally speaking,
     * any comparator that violates this condition should clearly indicate
     * this fact.  The recommended language is "Note: this comparator
     * imposes orderings that are inconsistent with equals."
     */
    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();    // sort in descending order
    }
}

class IntegerComparator implements Comparator<Integer> {

    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.<p>
     * <p>
     * The implementor must ensure that {@link Integer#signum
     * signum}{@code (compare(x, y)) == -signum(compare(y, x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * compare(x, y)} must throw an exception if and only if {@code
     * compare(y, x)} throws an exception.)<p>
     * <p>
     * The implementor must also ensure that the relation is transitive:
     * {@code ((compare(x, y)>0) && (compare(y, z)>0))} implies
     * {@code compare(x, z)>0}.<p>
     * <p>
     * Finally, the implementor must ensure that {@code compare(x,
     * y)==0} implies that {@code signum(compare(x,
     * z))==signum(compare(y, z))} for all {@code z}.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     * @throws NullPointerException if an argument is null and this
     *                              comparator does not permit null arguments
     * @throws ClassCastException   if the arguments' types prevent them from
     *                              being compared by this comparator.
     * @apiNote It is generally the case, but <i>not</i> strictly required that
     * {@code (compare(x, y)==0) == (x.equals(y))}.  Generally speaking,
     * any comparator that violates this condition should clearly indicate
     * this fact.  The recommended language is "Note: this comparator
     * imposes orderings that are inconsistent with equals."
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}


class Student implements Comparable<Student>{
    String name;
    double cgpa;

    public Student(String name, double cgpa) {

        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure {@link Integer#signum
     * signum}{@code (x.compareTo(y)) == -signum(y.compareTo(x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * x.compareTo(y)} must throw an exception if and only if {@code
     * y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code
     * x.compareTo(y)==0} implies that {@code signum(x.compareTo(z))
     * == signum(y.compareTo(z))}, for all {@code z}.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     * @apiNote It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     */

        //Comparable interface is used to define the natural ordering of objects.
    // It is implemented by the class whose objects need to be ordered.
    // The compareTo() method is overridden to provide the logic for comparing two objects of the same class.
    // In this case, we are comparing Student objects based on the length of their names. @Override
    public int compareTo(Student o) {
        return Double.compare(this.name.length(), o.name.length());
    }
}
public class ComparatorClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Rohit");
        list.add("Rahul");
        list.add("Saurabh");


        list.sort(new StringLengthComparator());
        System.out.println(list);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(89);
        list1.add(59);
        list1.add(26);
        list1.add(67);

        list1.sort(new IntegerComparator());
        System.out.println(list1);

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("Ravi", 8.9));
        list2.add(new Student("Mohit", 8.9));
        list2.add(new Student("Rahul", 8.7));
        list2.add(new Student("Saurabh", 9.1));


        /*list2.sort((o1, o2) -> {
            if(o1.getCgpa() > o2.getCgpa())
            {return -1;}

            else if (o2.getCgpa() > o1.getCgpa()) {
                return 1;
            }else {
                return 0;

                return o1.getName().compareTo(o2.getName()); //comparing by name if cgpa is same
            }

        });

        */
        //using method reference
        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed();

        //then comparing method -- > after comparing cgpa it will come by naming order if cgpa is same
        Comparator<Student> comparator2 = Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName);


        list2.sort(comparator);
        for(Student s : list2) {
            System.out.println(s.getName() + " " + s.getCgpa());
        }


        list2.sort(comparator2);
        for(Student s : list2) {
            System.out.println(s.getName() + " " + s.getCgpa());
        }

    }
}
