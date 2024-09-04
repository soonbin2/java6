package com.ohgiraffers.level02.normal;

public class Application2 {
    public static void main(String[] args) {
        /* 실수를 변수로 선언하여 점수를 저장하고,
         * 이를 정수로 변환하여 점수가 90점 이상이면 "A",
         * 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D",
         * 60점 미만이면 "F"를 출력하는 프로그램을 작성해본다.
         *
         * -- 출력 예시 --
         *
         * 홍길동의 이번 점수등급은 B입니다.
         *
         * */
        double num1 = 80.5;
        int inum = (int) num1;
        String result = (inum >=90)? "A" :(inum >=80)? "B" :(inum>=70)? "C" :(inum>=60)? "D" : "F";
        System.out.println("홍길동의 이번 점수등급은 " + result +"입니다.");
    }
}
