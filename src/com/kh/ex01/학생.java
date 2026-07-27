package com.kh.ex01;

public class 학생 {

    //속성 - 변수선언
    //접근제한자 변수타입 변수명;
    public String name;

    public int age;

    //외부에서 접근이 불가능
    private String school = "에듀";

    //생성자 - 필드와 생성자 사이에 작성

    
    //기본생성자 - 생성자가 없는 경우 컴파일러가 자동으로 만들어 줌
    //생성자가 하나라도 있으면 안만들어줌
    public 학생() {
        System.out.println("기본 생성자");
    }

    //매개변수 있는 생성자
    //객체를 초기화
    //생성자의 특징 - 1.반환타입이 없다, 2.클래스명과 동일하다

    //변수명과 필드명이 같은경우, 변수가 우선시됨
    //필드에 접근하기 위해 this 키워드를 사용
    //매개변수를 이용해서 필드를 초기화
    public 학생(String name, int age, String school) {
        System.out.println("매개변수가 있는 생성자");

        this.name = name;
        this.age = age;
        this.school = school;
    }
    //메서드
    public void deunggyo(){

    }
    public void hagyo(){

    }

    //모부메서드 재정의
    //모든객체는 Object라는 클래스를 상속받는다
    //print 함수가 호출될때 실행
    @Override
    public String toString(){
        // return super.toString();
        //return school +"/"+ name+"/"+age;
        return"""
            school : %s
            name : %s
            age : %d

                
                """.formatted(this.school,this.name,this.age);
    }
}
