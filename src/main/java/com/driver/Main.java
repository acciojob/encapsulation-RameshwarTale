package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj = new RWOnly();

        //obj.name = "Rameshwar";

      //   java: name has private access in com.driver.RWOnly

        obj.setName("Rameshwar");

        System.out.println(obj.getName());
    }
}