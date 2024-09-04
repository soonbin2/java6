package com.ohgiraffers.Team;

public class Application1 {
    public static void main(String[] args) {
//        실수형 변수를 선언하고 해당 값을 정수로 변환한 뒤
//        삼항 연산자를 사용하여 값이 100보다 작으면 min, 100보다 크면 max를 출력하는 프로그램을 작성하세요
        double num1 = 55.5;
        double num2 = 101.5;
        int inum = (int) num1;
        int inum2 = (int) num2;

        String result = (inum>100)? "max" : (inum <100)? "min":"false";
        String result2 = (inum2>100)? "max" : (inum2 <100)? "min":"false";

        System.out.println(result);
        System.out.println(result2);    }


}
