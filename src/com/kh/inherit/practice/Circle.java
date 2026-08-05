package com.kh.inherit.practice;

public class Circle extends Point {
    private int radius;
    public Circle(){

    }
    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("반지름 : " + radius);
        System.out.println("면적 : " + (Math.PI*radius*radius));
        System.out.println("둘레 : " + (2*Math.PI*radius));
    }
    
}
