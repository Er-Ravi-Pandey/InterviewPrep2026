package com.DSA.DesignPatten.BuilderPattern;


//Builder pattern mostly used in immutables cases
//👉 Problem:
//When an object has many optional fields, constructor becomes messy:
//User user = new User("Ravi", 25, "Delhi", "Engineer", true, false);
//Hard to read
//Hard to maintain
//Order matters → error-prone



//Builder Pattern solution
//
//👉 Instead of a big constructor, you build object step by step:


//User user = new User.Builder("Ravi")
//                .age(25)
//                .city("Delhi")
//                .profession("Engineer")
//                .build();
//Now:
//
//Readable ✅
//Flexible ✅
//No confusion of parameter order ✅



//Don’t memorize code—understand this:
//
//Used when object has many optional fields
//Avoids constructor explosion
//Improves readability & immutability
//Supports method chaining



//Usage-DTOs (Request/Response objects)
//Config objects
//Complex object creation (microservices configs etc.)
public class User {
    private String Username;
    private String emailId;

    private String userId;


    private User(UserBuilder build) {
        this.userId = build.userId;
        this.emailId = build.emailId;
        this.Username = build.Username;


    }

    public String getUsername() {
        return Username;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", emailId='" + emailId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    static class UserBuilder {
        private String Username;
        private String emailId;

        public UserBuilder() {

        }

        private String userId;


        public UserBuilder setUsername(String username) {
            Username = username;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }


        public User build() {
            User user = new User(this);
            return user;
        }


    }

}
