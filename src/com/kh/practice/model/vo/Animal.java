package com.kh.practice.model.vo;

public abstract class Animal {
    //필드 - 데이터를 저장
    private String name;
    private String kinds;

    //생성자 : 반환타입이 없고, 클래스명과 같다
    protected Animal(){

    }

    //매개변수가 있는 생성자
    //생성자의 오버로딩
    protected Animal(String name, String kinds){
        //필드를 초기화
        this.name = name;
        //이름이 다르면 this 안써도 됨
        this.kinds = kinds;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getKinds(){
        return kinds;
    }
    public void setKinds(String kinds){
        this.kinds = kinds;
    }
    @Override
    public String toString(){
        //super : 부모 메서드를 호출
        return "이름=" + name + ",종="+kinds;
    }
    //추상 메서드 - 코드 블럭이 없음
    public abstract void speak();

}
