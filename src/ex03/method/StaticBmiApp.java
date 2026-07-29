package ex03.method;

import ex03.method.obj.*;

/*
정적 메서드 / 필드
프로그램이 시작할 때 메모리에 미리 올라가며, 생성하지 않고 사용 가능
사용방법 : 클래스명.메서드명, 클래스명.필드명
*/

public class StaticBmiApp {

    //정적 메서드에서는 정적 메서드만 호출이 가능하다
    public static void main(String[] args) {
        double bmi =  Basic.getBmi(1.45, 32.3);
        String bmistr = Basic.bmiToStr(bmi);
        System.out.println(bmistr);
        System.out.println(bmi);

        //+ getLotto() - 1-46 임의의 숫자를 뽑아서 배열에 담아서 반환
        //0-1미만의 임의의 실수를 만들어 주는 기능
        //유틸리티
        
        double random = Math.random() * 46 + 1;
        //형변환
        //double 타입 -> int 타입으로
        int num = (int)random;


        System.out.println(random);
        System.out.println(num);
    }
}
