package com.kh.univ;

public class study {
    //private : 외부에서 접근이 불가능
    //클래스 내부에서만 사용이 가능하다
    private String 학과번호;
    private String 학과명;
    private int 정원;

    //반환타입이 없다 클래스명과 같다
    public study(String 학과번호, String 학과명, int 정원) {
        this.학과번호 = 학과번호;
        this.학과명 = 학과명;
        this.정원 = 정원;
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
}
