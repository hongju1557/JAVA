package ex03.method.obj;

public class Basic {
    // public String name(String name){
        
    // }
    // public int age(int age){
        
    // }

    // public double height(double height){

    // }
    public void info(String 이름, int 나이, double 키) {

        //숫자를 나타내는 타입
        // 정수형 - int
        // 실수형 - double
        System.out.println("""
                이름 : %s 
                나이 : %d
                키 : %.2f
                """.formatted(이름,나이,키));
    }

    public String getInfo(String 이름, int 나이, double 키) {
        return "이름 : %s, 나이 : %d, 키 : %.2f".formatted(이름,나이,키);
    }

    // 실수 - m/kg
    public static double getBmi(double h, double w) {
        double bmi = 0.0;
        //신체질량지수(BMI)
        //bmi = 체중 / (신장(m)*신장(m))
        //당신의 키 , 몸무게는 , bmi , 정상입니다.
        bmi=w / (h*h);
        return bmi;
    }

    //형변환
    //정수 cm/kg
    // public static String getBmiStr(int h, int w) {
    //     String bmistr = "";
    //     double bmi = 0.0;
    //     //신체질량지수(BMI)
    //     //bmi = 체중 / (신장(m)*신장(m))
    //     //당신의 키 , 몸무게는 , bmi , 정상입니다.
    //     // 소수점 2자리까지 출력한다

        
    //     bmi = w / ((double)h/100*(double)h/100);
        
    //     String res = "";
    //     //+ bmiTostr(bmi:double):String
    //     //18.5 미만 저체중, 22.9 이하 정상, 24.9 이하 비만전단계 , 나머지 비만
    //     if(bmi<18.5){res = "저체중";}
    //     //문장의 끝은 ;, 문자열은 ""로 감싼다
    //     else if (bmi<=22.9){res = "정상";}
    //     else if (bmi<=24.9){res = "비만전단계";}
    //     else{res = "비만";}

    //     bmistr = """
    //         키 : %dcm, 몸무게 : %dkg, bmi : %f, %s 입니다. 
    //         """.formatted(h,w,bmi,res);
    //         return bmistr;
    // }
    public static String getBmiStr(int h, int w) {

    double bmi = w / ((double) h / 100 * (double) h / 100);

    String res = bmiToStr(bmi);   // <-- 여기서 호출

    return """
        키 : %dcm, 몸무게 : %dkg, bmi : %.2f, %s 입니다.
        """.formatted(h, w, bmi, res);
}
    public static String bmiToStr(double bmi) {

    if (bmi < 18.5) {
        return "저체중";
    } else if (bmi <= 22.9) {
        return "정상";
    } else if (bmi <= 24.9) {
        return "비만전단계";
    } else {
        return "비만";
    }
}

    public static void main(String[] args) {
        double bmi = getBmi(1.63,125.5);
        System.out.println(bmi);

        String bmistr = getBmiStr(163, 98);
        System.out.println(bmistr);

        //정수의 연산 결과는 정수
        //타입변환 (형변환) - 명시적 형변환/자동 형변환
        //(타입)
        long l = 100;
        System.out.println((double)100/3);
    }

}
