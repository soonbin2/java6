package com.ohgiraffers.Team;

public class Application3 {
    public static void main(String[] args) {
        // 정수 (10 , 20, 30 , 40) 4개를 변수로 선언한 후 실수로 변환하여 최대값 과 최소값을 삼향연산자로 출력한 뒤
        //최대값과 최소값의 차이값을 출력하시오.

        int num1 =10;
        int num2=20;
        int num3= 30;
        int num4=40;

        float fnum1 = num1;
        float fnum2 = num2;
        float fnum3 = num3;
        float fnum4 = num4;

        String result1 = (fnum1<=10.0)? "10.0":"40.0";
        String result2 = (fnum4>=40.0)? "40.0": "10.0";
        System.out.println("최소값 : " + result1);
        System.out.println("최대값 : " + result2);

        float result3 = fnum4 - fnum1;
        System.out.println("차이값 : " + result3);
    }
}
