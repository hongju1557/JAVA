package com.kh.practice.model.vo;

//자식이 부모를 지정(extends 키워드를 이용)
//자식은 부모가 가진 모든 필드와 메서드를 상속
//미구현된 메서드가 있다면 구현해야함
//->아니면 추상 클래스가 되어야 함
public class Dog extends Animal {
    public static final String PLACE = "애견카페";
    private int weight;
    public Dog() {

    }
    public Dog (String name, String kinds, int weight){
        super(name, kinds);
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    @Override
    public void speak() {
        System.out.println("몸무게는 " + weight + "kg입니다.");
    }
}
