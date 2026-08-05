package com.kh.inherit.Util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(String msg){

        while(true){
            try{
                System.out.println(msg);
                return Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("숫자만 입력하세요.");
            }
        }

    }
    public static String inputString(String msg){
        System.out.println(msg);
        return sc.nextLine();
    }
}
