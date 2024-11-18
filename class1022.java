import javax.swing.*;

public class class1022 {
    public static void main(String[] args){

//        //for each文
//        int[] numbers = {1,2,3,4,5};
//        for (int number : numbers){
//            System.out.println(number);
//        }
//        int bar = 0;
//        for (System.out.println("初期化");bar < 2;System.out.println("中間値")){
//            System.out.println("Hello world");
//            bar ++;
//        }
//
//        for (int foo = 0; foo < 2; foo++){
//            System.out.println("Hi");
//        }

        // * を１０個出力せよ
        // **********

//        for (int n = 1; n <= 10; n++){
//            System.out.print("*");
//        }

        // 1~10のなかで偶数を出力せよ
//        for (int x = 2; x <=10; x+=2){
//            System.out.println(x);
//        } //これは先生の好みではないらしい、

//        for (int y = 1; y <= 10; y++){
//            if (y % 2 == 0){
//                System.out.println(y);
//            }
//        }

        // z~aを出力
//        char bar = 33;
//        System.out.println(bar);
//        for (char chValue = 'Z'; chValue >= 'A'; chValue--){
//            System.out.print(chValue + "\t");
//        }
//
//        System.out.println();
//
//        //　１つ飛ばしで出力
//        for (char chValue = 'Z'; chValue >= 'A'; chValue-=2){
//            System.out.print(chValue + "\t");
//        }


        int bar[] = new int[5];
        // bar 배열의 각 원소의 값을 초기화
        for (int iCount = 0, value = 1; iCount < bar.length ; iCount++, value *= 10){
            bar[iCount] = value;
        }
        // bar 배열의 각 원소의 값을 출력 (배열 = 配列)
        for (int iCount = 0; iCount < bar.length ; iCount++){
            System.out.println(bar[iCount]);
        }


    }
}
