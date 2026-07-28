package ex03.method;

import ex03.method.obj.*;

public class App {
    public static void main(String[] args) {
        // 패키지가 다른 경우 import문을 작성해야한다 -> 자동완성 가능
        // Basic 객체 생성하기
        Basic basic = new Basic();
        // + info(name:String, age:int, height:double):void
        // 이름, 나이, 키를 받아서 출력
        basic.info("홍쥬",78,168.2);
        // + getInfo(name:String, age:int, height:double):String
        // 이름, 나이, 키를 받아서 한줄로 반환
        String basic_info = basic.getInfo("홍주",52,168.2);
        //반환 받은 값을 변수에 저장해서 출력
        System.out.println(basic_info);

        // getBmi(키 - m:double, 몸무게 - kg:double):double
        // Basic bmi = new Basic();
        //메서드를 호출할때는 값만 넘겨줌
        double bmi = basic.getBmi(1.682, 103.5);
        System.out.println("BMI : " + bmi);
    }
}
