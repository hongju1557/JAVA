package com.kh.inherit;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;
import com.kh.inherit.practice.Person;
import com.kh.inherit.Util.*;

public class ApplicationPerson {
    public static void main(String[] args) {
        // Person[] p = new Person[3];
        // p[0] = new Student("홍북", 34, 152, 124, 5, "노어노문");
        // p[1] = new Employee("도로롱", 42, 187, 57, 120, "영업부");
        // p[2] = new Student("구구가가", 54, 152, 122, 3, "국어국문");

        // for(Person person : p ){
        //     System.out.println(person.information());
        // }

        Person[] p = new Person[4];

        for(int i=0; i< p.length; i++){

            int menu = InputUtil.inputInt("1.학생 2.직원 선택 : ");

            if (menu ==1) {
                
            

        String name = InputUtil.inputString("이름 : ");
        int age = InputUtil.inputInt("나이 : ");
        int height = InputUtil.inputInt("키 : ");
        int weight = InputUtil.inputInt("몸무게");
        int grade = InputUtil.inputInt("학년 : ");
        String major = InputUtil.inputString("전공 : ");

        p[i] = new Student(name, age, height, weight, grade, major);
        }
     else if (menu == 2) {
        String name = InputUtil.inputString("이름 : ");
        int age = InputUtil.inputInt("나이 : ");
        double height = InputUtil.inputInt("키 : ");
        double weight = InputUtil.inputInt("몸무게 : ");
        int salary = InputUtil.inputInt("급여 : ");
        String dept = InputUtil.inputString("부서 : ");

        p[i] = new Employee(name, age, height, weight, salary, dept);
     }
     else {
        System.out.println("1 또는 2만 입력하세요.");
        i--;
    }
};

        for (Person person : p){
            System.out.println(person.information());
        }


    }
    }

