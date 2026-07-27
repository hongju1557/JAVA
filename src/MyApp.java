//클래스선언부
// 코드블록 {}
// 접근제한자 class 클래스명 {}

import java.util.Scanner;

public class MyApp {

    //속성 = 필드
    //타입 변수명 = 값

    //기능 = 메서드
    //메서드 선언부
    //접근제한자 반환타입
    //void : 반환타입이 없으면 적어주는 키워드
    public static void main(String[] args){
        // 변수 선언
        // 변수타입 변수명 = 값(리터럴);
        // int, double, String
        String name = "hongjew";
        int age = 45;

        System.out.println(name);
        System.out.println(age);

        //a,b 변수를 선언하고 두 변수의 합을 출력
        int a = 4;
        int b = 5;
        int res = a+b;
        System.out.print("두수의 합 :" );// 줄바꿈 없이 출력
        System.out.println(res); //출력 후 줄바꿈

        // 하나의 문자를 작은 따옴표로 감싼 것
        char var = 'A';
        char var1 = 65;

        //+연산자는 문자열을 연결
        System.out.println("var : " + var);
        System.out.println("var : " + var1);
        
        //int 타입의 번호를 넘어서는 경우
        //리터럴이 들어오면 기본타입으로 변경
        // 정수는 int형, 실수는ㄴ double형
        //long(l,L), float(f,F)같은 경우 
        long num = 200000000000L;
        double num2 = 1.2;
        long num3 = 4;

        //변수명을 작성할 때
        //이미 선언된 변수명은 사용 불가
        //예약어(키워드) 사용할 수 없음
        //숫자가 앞에 올 수 없다
        //소문자로 작성한다(단, 상수는 대문자)
        //_,$ 사용 가능
        //여러개의 단어가 합쳐질 경우 카멜표기법을 사용한다

        boolean truevar = true;
        boolean result = num2 > num3;
        if(result){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        // 이스케이프 문자
        // 정해진 역할이 있는 문자들을 출력할 때 \를 붙여준다
        // ex) ",', \
        System.out.println("\"");
        System.out.println("\"오늘도 수고가 많으십니다\"");

        // 자동형변환 가능한 경우
        // 값의 허용범위가 작은 타입이 큰타입으로 대입될때
        byte n = 127; // -128~127

        // n++, ++n
        System.out.println("127++ : " + n++);
        System.out.println(n);

        int i = n;

        //강제형변환 -> 값이 왜곡될 수 있음
        System.out.println((byte)1000);

        //입력을 받기 위해 사용하는 객체
        //변수타입 : 객체는 타입으로 사용할 수 있다
        //입력받기 위해서 입력을 받을 수 있는 스캐너 개체를 생성
        Scanner scanner = new Scanner(System.in);
        //콘솔창에서 입력을 대기하고 있다가 엔터키가 눌러지면 사용자의 입력을 받아서 반환하는 역할
        String str = scanner.next();
        System.out.println("사용자의 입력값 : "+str);

        //출력 - 형식에 맞게 출력

    }
}
