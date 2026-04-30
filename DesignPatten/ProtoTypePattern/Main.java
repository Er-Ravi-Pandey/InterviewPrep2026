package com.DSA.DesignPatten.ProtoTypePattern;


import javax.crypto.spec.PSource;
//👉 Instead of creating object from scratch, you clone an existing object

//🔹 Why do we need it?
//
//Problem:
//
//Object creation is costly or complex
//Too many fields / setup steps
//
//Example:
//
//Creating a config object with 20 fields
//Creating a DB connection template
//Complex nested objects
//
//👉 Creating again and again = slow + repetitive



//🔹 Solution (Prototype)
//
//👉 Create once → then clone it whenever needed


//🔹 Where you’ll see it in real world
//Spring bean cloning (scope-based)
//Caching templates
public class Main {
    public static void main(String[] args) throws InterruptedException {


      NetworkingExample  networkData=new NetworkingExample();


      System.out.println("Creating object");
      networkData.setIp("233,6565,7787");



      networkData.loadImportantData();
      System.out.println(networkData);


      //second object is clone of the first and it is not taking time to load since only time taken is during first call.

      try{
          NetworkingExample networkData2 = (NetworkingExample) networkData.clone();
          NetworkingExample networkData3 = (NetworkingExample) networkData2.clone();

          System.out.println("Loading second object instantly");
          System.out.println(networkData2);
          System.out.println(networkData3   );
      } catch (CloneNotSupportedException e) {
          throw new RuntimeException(e);
      }
    }
}
