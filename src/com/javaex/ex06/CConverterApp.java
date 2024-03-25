package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        won =1_000_000;
        dollar = CConverter.toDoller(won);
        System.out.println("백만원은 " + dollar + "달러 입니다.");
        
        //100달려를 원으로 출력하기
        dollar = 100;
        won = CConverter.toKWR(dollar);
        System.out.println("백달러는 " + won + "원 입니다.");
        
        
    }

}
