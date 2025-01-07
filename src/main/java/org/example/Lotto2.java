package org.example;

import java.util.Arrays;

public class Lotto2 {
    public static void main(String[]args) {

        int[] balls = new int[45];
        //1부터 45까지의 공만들기
        for (int i = 0; i < balls.length; i++) {
            balls[i] = i + 1;

        }
        System.out.println(Arrays.toString(balls));
        //임의의 숫자 0부터 44까지 6번 뽑기
        for(int i =0;i<6;){
            int idx=(int)(Math.random()*45); // 임의의 배열 내 인덱스 번호
            int value=balls[idx]; // 내용물

            //만일 Value가 -1이면 continue
            if(value==-1){
                System.out.println("중복 발생");
                continue;
            }
            System.out.println(value);
            balls[idx]=-1; //출력한 다음에는 내용물을 -1로 바꿈
            i++;
        }
        System.out.println(Arrays.toString(balls));

    }

}
