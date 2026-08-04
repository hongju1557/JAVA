package com.kh.practice;
import com.kh.practice.model.vo.*;
public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog("미트로프", "시고르잡종", 5);
        Cat cat = new Cat("비상식량", "코리안롱노즈","길","하양");

        System.out.println(dog);
        dog.speak();

        System.out.println(cat);
        cat.speak();

    }
}
