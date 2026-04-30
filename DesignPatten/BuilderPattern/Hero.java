package com.DSA.DesignPatten.BuilderPattern;

public class Hero {
    private String name;
    private String type;
    private int age;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    private Hero(HeroBuilder heroBuilder){

        this.age=heroBuilder.age;
        this.name=heroBuilder.name;
        this.type= heroBuilder.type;
    }


    static class HeroBuilder{
        private String name;
        private String type;
        private int age;

        public HeroBuilder(){

        }

        public HeroBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public HeroBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public HeroBuilder setAge(int age) {
            this.age = age;
            return this;

        }

        public Hero build(){
            Hero hero=new Hero(this);
            return hero;
        }
    }
}
