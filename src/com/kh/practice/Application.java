package com.kh.practice;
import com.kh.practice.model.vo.*;
//vo/dto : 필드와 setter, getter 메서드를 가진 
//데이터를 담는 그릇과 같은 역할
public class Application {
    public static void main(String[] args) {
        //추상 클래스는 생성이 불가능하다
        Dog dog = new Dog("미트로프", "시고르잡종", 5);
        Cat cat = new Cat("비상식량", "코리안롱노즈","길","누렁");
        Bird bird = new Bird("닭둘기", "참새", 5);

        System.out.println(dog);
        dog.speak();
        
        System.out.println(cat);
        cat.speak();
        
        System.out.println(bird);
        bird.speak();

        //1. Animal 타입의 객체 배열 생성[방의 갯수]
        Animal[] animals = new Animal[5];
        //2.각 인덱스에 무작위로 dog, cat을 생성해서 넣기
        animals[0] = new Dog("쵸콜렛", "치와와", 84);
        animals[1] = new Cat("포도", "페르시안", "서울역", "검정");
        animals[2] = new Bird("홍북이", "비둘기", 4);
        animals[3] = new Dog("간장게장", "허스키", 72);
        animals[4] = new Cat("애플파이", "포메라니안", "부산역", "하양");

        for (Animal a : animals){
            System.out.println(a);
            a.speak();
        }

    }
}
