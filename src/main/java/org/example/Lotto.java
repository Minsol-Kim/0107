package org.example;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args){

       //결과물을 담을 배열 선언
        int[] ball = new int[6];
        int len = ball.length;

        //1~45 랜덤
        for(int i=0;i<len;i++){

            ball[i] = (int) (Math.random() * 45)+1;

        }
        //배열의 내용물 확인
        System.out.println(Arrays.toString(ball));

    }



}
