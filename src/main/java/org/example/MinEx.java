package org.example;

public class MinEx {

    public static void main(String[] args) {

        int[] arr = {32, 34, 22, 13, 6, -3};
        int min = arr[0];
        int max = arr[0];



        for (int value : arr) {

            System.out.println(value);

            //value이 min보다 작으면 min값은 value
            // min=value<min?value:min; 삼항연산자 이용

            if (value < min) {
                min = value;
            }
            if(value>max){
                max=value;
            }
            System.out.println("Min: " + min);

        }//for end
    }

}
