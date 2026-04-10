package com.DSA.Streams;

interface Emp {
    public String getNames();
    public String getDesignation();
}

class AnonymsInnerClass {
    public static void main(String[] args) {
        Emp emp=new Emp() {
            @Override
            public String getNames() {
                return "Ravi";
            }

            @Override
            public String getDesignation() {
                return "Developer";
            }
        };
        System.out.println(emp.getNames());
        System.out.println(emp.getDesignation());

        }
    }



