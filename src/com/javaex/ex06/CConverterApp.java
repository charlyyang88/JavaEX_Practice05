package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
//        CConverter.setRate(1118.70);
        CConverter.setRate(1341.30); // 240326 고시환율
        
        //100만원을 달러로 출력하기
        dollar = CConverter.toDoller(1_000_000);
        System.out.println("백만원은 " + dollar + "달러 입니다.");
        
        //100달려를 원으로 출력하기
        dollar = 100;
        won = CConverter.toKWR(dollar);
        System.out.println("백달러는 " + won + "원 입니다.");
        
        
    }

}
