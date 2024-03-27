package com.javaex.ex09;

public class StringUtil {

        //메소드 내용작성
        public static String concatString(String[] strArray) {
        	StringBuilder sb = new StringBuilder();
        	for(String str : strArray) {
        		sb.append(str);
        	}
        	return sb.toString();
    }

}
