package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        //for문 시작
        //친구정보 3명 입력 로직 --> 반복문 사용
        for (int i=1; i <= friendArray.length; i++) {
        	sc.next();        	
        	System.out.println("이름: ");
        	System.out.println("핸드폰: ");
        	System.out.println("학교");
        	System.out.println("-------------------");
        }
      
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	
        }

        sc.close();
    }

}
