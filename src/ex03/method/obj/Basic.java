package ex03.method.obj;

import java.util.Arrays;

public class Basic {

    //반환이 있는 메서드
    //반환이 없는 메서드 (void)
    // 정적 메서드/정적 필드 (static)
    //객체를 생성하지 않고 클래스 이름으로 바로 불러와서 사용할 수 있는 메서드/필드

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

    public static int[] Ex01(){
        //배열 만들기
        //배열-> 컬렉션 프레임 워크(List, Set, Map)
        //1.타입이 같은 데이터를 여러개 보관
        //2.길이(갯수)가 정해져 있음

        //배열을 만들때 값을 넣고 배열을 만드는 방법
        int[] Lotto = {1,2,3,4,5,6};
        Lotto[0] = 1;
        //방의 갯수를 지정해서 배열을 만드는 방법
        int[] Lootto = new int[6];
        Lootto[0]=1;

        //배열의 선언과 초기화
        String str[] = {"이홍주","김홍주"};

        //배열을 선언
        String str1[] = new String[2];
        //배열을 초기화
        str1[0] = "이홍주";

        
        //반복문을 이용해서 배열에 접근해서 값을 출력
        //초기값, 비교, 증감값
        //배열의 길이 : 배열의 변수 이름.length
        for(int i=0;i<str1.length;i++){
            System.out.println("str1 :" + str1[i]);
        }

        //향상된 for문
        String lottoStr = "";
        for(int num:Lootto){
            // System.out.print(num + " ");
            lottoStr += num + ",";
        }

        System.out.println("lotto : " + lottoStr);
        System.out.println(lottoStr.substring(0, lottoStr.length()-1));
        System.out.println("hello".length()); 
        System.err.println("hello".substring(2));
        //시작인덱스 포함, 끝인덱스 불포함
        System.out.println("hello".substring(0, 3));
        //해당 문자열의 위치를 반환
        //해당 문자열이 없으면 -1을 반환
        System.out.println("hello".indexOf("l"));
        if("hello".indexOf("l")>-1){
            System.out.println("문자가 포함되어 있어요");
        }
        //앞뒤의 공백을 모두 제거
        System.out.println("   abc123    ".trim());

        System.out.println("hello".replace("l","o"));

        System.out.println("abc".equals("abc"));

        String a = "abc";
        String b = "abc";

        System.out.println("a==b : "+a.equals(b));
        System.out.println("a==b : "+(a == b));

        String aa = new String("abc");
        String bb = new String("abc");

        System.out.println("aa==bb: " + (aa == bb));
        // 문자열의 값을 비교할때는 equals 메서드를 이용해야함
        System.out.println("aa==bb : " + aa.equals(bb));

        //타입의 기본값
        //필드를 초기화 하지 않은경우 타입의 기본값
        //배열의 값을 초기화 하지 않은 경우 타입의 기본값
        //참조타입의 기본값 = null
        String name = null;
        //예외를 처리하지 않으면 프로그램이 비정상적으로 종료 -> try/catch
        System.out.println(name.length());
        if(name != null){
            System.out.println("name : " + name);
        }else {
            System.out.println("name은 null 입니다.");
        }

        String res = "Y";
        //문자열이 Y이면 계속 실행
        if(res != null && res.equals("Y")){

        }
        //리터럴이 먼저 오는 경우, null 체크 할 필요가 없다
        //대소문자를 구분하지 않고 비교
        if("y".equalsIgnoreCase(res)){
            System.out.println("Y비교 - 대소문자를 가리지 않음");
        }
        return Lotto;

        
    }

    // + getLotto() - 1-46까지 임의의 숫자를 뽑아서 배열에 담아서 반환
    // 접근제한자 반환타입 메서드이름(매개변수의타입 매개변수의 이름){ }
    public static int[] getLotto(){
        //1.정수(숫자) 6개를 저장할 수 있는 배열을 만들고 변환
        int[] lotto = new int[6];
        //배열의 값을 초기화 하지 않으면 타입의 기본값 0,0,0...
        //반복문을 이용해서 배열에 임의의 수를 생성해서 넢기
        //i=0부터 5까지 1씩 증가하면서 코드블럭을 실행
        for(int i=0; i<lotto.length; i++){
            
            lotto[i]=(int)(Math.random()*45)+1;
            //임의의 번호를 뽑아서 변수에 저장
            //배열을 돌면서 중복된 값이 있는지 확인
            //j는 0부터 인덱스보다 작을때가지 1씩 증가하면서 코드블럭 실행
            for(int j=0;j<i;j++){
                //j는 0부터 i보다 작을때까지
                if(lotto[i]==lotto[j]){
                    System.out.println(Arrays.toString(lotto));
                    System.out.println("중복 되었어요");
                    i--;
                    break;
                }

            }
        }
        //배열의 요소에 값을 출력
        //Arrays.toString() : 배열의 값을 문자열로 반환
        System.out.println((Arrays.toString(lotto)));
        return lotto;
    }

    public static void printMenu(){
        System.out.println(
            """
                    메뉴
                    1.BMI 계산기
                    2.로또생성기

                    메뉴를 선택 해주세요.
                    종료하시려면 9를 눌러주세요
                    """
        );
    }

    public static void main(String[] args) {
        // Ex01();
        Basic.getLotto();
    }

    // public static void main(String[] args) {
    //     double bmi = getBmi(1.63,125.5);
    //     System.out.println(bmi);

    //     String bmistr = getBmiStr(163, 98);
    //     System.out.println(bmistr);

    //     //정수의 연산 결과는 정수
    //     //타입변환 (형변환) - 명시적 형변환/자동 형변환
    //     //(타입)
    //     long l = 100;
    //     System.out.println((double)100/3);
    // }

}
