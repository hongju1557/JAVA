package com.kh.univ;

public class study {
    //private : 외부에서 접근이 불가능
    //클래스 내부에서만 사용이 가능하다
    //필드를 초기화하지 않으면 타입의 기본값으로 설정
    private String 학과번호;
    private String 학과명;
    private int 정원;

    //생성자의 오버로딩

    //기본 생성자
    public study(){

    }

    //생성자의 오버로딩
    public study(String 학과번호, String 학과명){
        //필드 초기화
        //값이 들어있는지 확인
        //문자열이 비어 있는 지 확인 -> null이 아닌지 확인, ""인지 확인
        if(학과번호 != null && !학과번호.equals("")){
        this.학과번호 = 학과번호;
        }
            if (학과명 != null && !학과명.equals("")) {
        this.학과명 = 학과명;
    }
    }

    //반환타입이 없다 클래스명과 같다
    public study(String 학과번호, String 학과명, int i) {
        //생성자 호출은 첫줄에 올 수 있다
        // this.학과번호 = 학과번호;
        // this.학과명 = 학과명;
        this(학과번호, 학과명);
        this.정원 = i;
    }

    //반환타입을 작성하면 return을 적어야 함

    public String get학과번호(){
        return 학과번호;
    }

    public String get학과명(){
        return 학과명;
    }

    public int get정원(){
        return 정원;
    }

    @Override
    public String toString() {
        return """
                학과번호 : %s
                학과명 : %s
                정원 : %d
        
        """.formatted(학과번호, 학과명, 정원);
    }

    //+ info():String
    //학과의 정보를 한줄로 반환
    public String info(){
        return """
                학과번호:%s 학과명:%s 정원:%d
                """.formatted(학과번호,학과명,정원);
    }

    public static void main(String[] args) {
        study study1 = new study("1557","롤학과",30);
        //toString()
        System.out.println(study1);
        System.out.println(study1.info());
    }
}
