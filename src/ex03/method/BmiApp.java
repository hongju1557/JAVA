package ex03.method;

import ex03.method.obj.*;

public class BmiApp {
    public static void main(String[] args) {
        // Basic basic = new Basic();
    
        //bmi 구하기
        double bmi = Basic.getBmi(1.63, 52.3);
    
        //bmi를 문자로 반환 받기
        String str = Basic.bmiToStr(bmi);
        System.out.println(str);
        
    }
    

}
