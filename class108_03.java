public class class108_03 {
    // 乗算演算子（*）とビットシフト演算子（<<）を用いた計算の実行時間を比較するもの
    public static void main(String[] args){

//        int iterations = 100000000; //実行回数、１億回に設定
//
//        long startTimeMultiplication = System.nanoTime(); // nanoTimeで乗算演算の開始時間を取得
//        for (int i = 0; i < iterations; i++){
//            int result = 10 * (int) Math.pow(2, 2);
//        }
//        long endTimeMultiplication = System.nanoTime(); // nanoTimeを使って終了時間を取得
//        long timeTakenMultiplication = endTimeMultiplication - startTimeMultiplication;
//
//        long startTimeShift = System.nanoTime(); // nanoTimeでビットシフト演算の開始時間を取得
//        for (int i = 0; i < iterations; i++){
//            int result = 10 << 2;
//        }
//        long endTimeShift = System.nanoTime();
//        long timeTakenShift = endTimeShift - startTimeShift;
//
//        System.out.println("Time taken using * operator: " + timeTakenMultiplication + " ns");
//        System.out.println("Time taken using << operator: " + timeTakenShift + " ns");
//

        // 練習　回数減らしてやってみる
        int count = 100;

        // ０から１００までの数字を画面に出力する時間を計算
        long startTime = System.nanoTime();

        for (int i = 1; i <= count; i++){
            System.out.println(i);
        }

        long endTime = System.nanoTime();
        long allTime = endTime - startTime;
        System.out.println("endTime" + allTime);



    }
}


