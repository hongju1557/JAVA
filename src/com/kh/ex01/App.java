package com.kh.ex01;

public class App {
    public static void main(String[] args) {
        // 학생객체를 생성
        // 타입 변수명 = new 타입();
        학생 학생1 = new 학생();

        //필드를 초기화
        학생1.name = "홍주";
        학생1.age = 45;

        학생 학생2 = new 학생();
        학생2.name = "홍북";
        학생2.age = 47;

        //매개변수가 있는 생성자를 이용해서 학생객체를 생성
        학생 학생3 = new 학생("김홍주", 40, "공단기");
        학생 학생4 = new 학생("이홍주", 49, "해커스");
        학생 학생5 = new 학생("주홍주", 48, "대성학원");

        // 객체를 print 메서드를 이용해서 출력하면 toString() 메서드가 호출
        // toString()메서드는 패키지를 포함한 클래스 이름@ 16진수 주소
        // -> 메서드 재정의를 통해서 내가 다시 정의할 수 있음
        System.out.println(학생3);
        System.out.println(학생4);
        
    }
}
