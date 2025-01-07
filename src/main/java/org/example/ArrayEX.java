package org.example;

public class ArrayEX {

    public static void main(String[] args){

        int[] arr = {10,30,24,32,42,15};

        //length = 6, 인덱스 번호 = 0,1,2,3,4,5
        int len= arr.length;

        for(int i=0;i<len;i++){
           // System.out.println(arr[i]);

            int value=arr[i];

            System.out.println(value);

        } //end for

        System.out.println("-----------------------------------");

        //내부적 촤적화 - 밑에 방법보다 더 빠른 방법
        for(int value:arr){
            System.out.println(value);
        }


    }
}
