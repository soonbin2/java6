package com.ohgiraffers.Team;

public class Application2 {
    public static void main(String[] args) {
        //        1. Pi를 상수로 3.14로 설정하고 초기화하세요.  반지름을 5로 선언 및 초기화 한 후 원의 넓이를 구하세요.
//        2. 나이를 정수로 선언하고 삼항연산자를 사용하여 19세 이상이면 성인, 미만이면 미성년자로 나오도록 구현하세요

        final double Pi;
        Pi = 3.14;
        int radius = 5;

        double result = radius * radius * Pi;
        System.out.println(result);

        int age = 27;
        String result2 = (age>=19)? "성인" : "미성년자";
        System.out.println(result2);
    }
}
