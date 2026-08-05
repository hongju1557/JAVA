package com.kh.inherit.practice;

public class Rectangle extends Point {
    public Rectangle(){}
    private double height;
    private double width;
    public Rectangle(int x, int y, double width, double height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("가로 : " + width);
        System.out.println("세로 : " + height);
        System.out.println("면적 : " + (width*height));
        System.out.println("둘레 : " + (2*(width+height)));
    }
}
