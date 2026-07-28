package com.kh.univ;

public class student {
    public static void main(String[] args) {
        study 학과1 = new study("1108","노어노문학과",30);
        
        System.out.println(학과1);

        //new를 만나서 생성자가 실행이 된다
        study 학과2 = new study("1109","중어중문학과",20);
        System.out.println(학과2);
    }
}
