package com.atguigu.java;

import java.util.Date;

public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                '}';
    }

    public HelloWorld() {
    }

    public static void main(String[] args) {

        System.out.println("hello world!");
        System.out.println("hello world!");
        System.out.println("hello world!");
        Date date = new Date();
        System.out.println();

            System.out.println("hello world!");
        System.out.println("hello world!");

    }

}
