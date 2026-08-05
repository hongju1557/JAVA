package com.kh.inherit;

import com.kh.inherit.practice.Circle;
import com.kh.inherit.practice.Rectangle;
import com.kh.inherit.practice.Point;

public class ApplicationPoint {
    public static void main(String[] args) {
        // Circle c = new Circle(3, 5, 10);
        // Rectangle r = new Rectangle(12, 15, 10, 12);
    
        // c.draw();
        // System.out.println();

        // r.draw();
        
        Circle[] c = new Circle[2];
        Rectangle[] r = new Rectangle[2];

        c[0] = new Circle(12, 13, 14);
        c[1] = new Circle(5, 4, 7);

        r[0] = new Rectangle(12, 15, 13, 14);
        r[1] = new Rectangle(5, 4, 11, 12);

        c[1].draw();

        // for(Circle circle : c){
        //     circle.draw();
        // }

        // for(Rectangle rectangle : r){
        //     rectangle.draw();
        // }
    }
    
}
