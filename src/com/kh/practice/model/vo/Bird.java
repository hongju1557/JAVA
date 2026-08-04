package com.kh.practice.model.vo;

public class Bird extends Animal{
    private int wings;
    public Bird(){

    }

    public Bird (String name, String kinds, int wings){
        super(name, kinds);
        this.wings = wings;
    }
    public int getWings(){
        return wings;
    }
    public void setWings(){
        this.wings = wings;
    }

    @Override
    public void speak(){
        System.out.println("날개 갯수는 "+wings+"개 입니다.");
    }

}
