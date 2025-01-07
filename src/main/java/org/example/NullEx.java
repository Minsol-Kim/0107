package org.example;

public class NullEx {

    public static void main(String args[]){

        int[] arr = new int[3]; //배열 -> 참조자료형

        arr=null; //점프하는곳이 없다, 가르키는 메모리가 없다. 기본 연산자처럼 사용 가능

        arr[1]=10;

    }
}
