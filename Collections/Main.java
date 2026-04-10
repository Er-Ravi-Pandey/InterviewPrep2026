package com.DSA.Collections;

import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Natural Order → Sort by ID
    @Override
    public int compareTo(Employee other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "Ravi", 50000));
        employees.add(new Employee(101, "Aman", 60000));
        employees.add(new Employee(102, "Zara", 55000));

        // 1️⃣ Sort by default (Comparable → by ID)
        Collections.sort(employees);
        System.out.println("Sorted by ID (Comparable):");
        employees.forEach(System.out::println);

        // 2️⃣ Sort by Name (Comparator)
        Comparator<Employee> nameComparator = (e1, e2) -> e1.name.compareTo(e2.name);
        Collections.sort(employees, nameComparator);
        System.out.println("\nSorted by Name (Comparator):");
        employees.forEach(System.out::println);

        // 3️⃣ Sort by Salary (Comparator)
        Comparator<Employee> salaryComparator = (e1, e2) -> Double.compare(e1.salary, e2.salary);
        Collections.sort(employees, salaryComparator);
        System.out.println("\nSorted by Salary (Comparator):");
        employees.forEach(System.out::println);
    }



//    Feature	Comparable	Comparator
//    Package	java.lang	java.util
//    Method	compareTo(T o)	compare(T o1, T o2)
//    Sorting logic defined	Inside the class (natural order)	Outside the class (custom order)
//    No. of sorting logics	Only one (natural)	Many (as many comparators as you want)
}

