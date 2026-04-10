package com.DSA.Collections;

import java.lang.ref.WeakReference;

public class GC {

    static class Phone{

        String model;
        int price;

        public Phone(String model, int price) {
            this.model = model;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Phone{" +
                    "model='" + model + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static void main(String[] args) {


        //when obeject Phone is created it is stored in heap memory and reference is stored in stack with strong reference

        WeakReference<Phone> reference=new WeakReference<>(new Phone("Nokia", 1000));
        System.out.println(reference.get());

        System.gc(); // this will wipe memory

        try{
            Thread.sleep(10000);
        }catch(Exception e){
        }
        System.out.println(reference.get()); // point reference to null after 10 sec

    }
}
