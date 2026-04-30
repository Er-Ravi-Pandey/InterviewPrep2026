package com.DSA.DesignPatten.BuilderPattern;

public class Main
{
    public static void main(String[] args) {
       User userBuilder= new User.UserBuilder().setUserId("232").setEmailId("ravi29shekhar@gmail.com").setUsername("Ravi").build();

        System.out.println(userBuilder);


      Hero heroBuilder=  new Hero.HeroBuilder().setAge(23).setType("Bollywood").setName("Salmon Bhai").build();
        System.out.println(heroBuilder);
    }
}
