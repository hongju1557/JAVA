package ex03.method;

import java.util.Scanner;

import ex03.method.obj.*;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1.메뉴를 출력
        while (true) {
            
        
        Basic.printMenu();
        //2.사용자 입력 받기
        int menu = scan.nextInt();
        System.out.println("menu : " + menu);
        //3.입력에 따라서 메서드를 실행
        if(menu==1){
            //bmi
            //키, 몸무게
            System.out.println("키를 입력해주세요");
            System.out.println("몸무게를 입력해주세요");
        }else if(menu==2){
            //로또 생성기
            Basic.getLotto();
        }else if(9 == menu){
            //프로그램 종료
            System.exit(0);
        }else{
            System.out.println("메뉴를 확인 후 다시 입력 해주세요");
        }
    }
}

}
