public class class1024 {
    public static void main(String[] args){

//        // １から２０以下で陽の整数の中で７の倍数を出力
//        for (int a = 1; a <= 20; a++){
//            if (a % 7 == 0){
//                System.out.println(a);
//            }
//        }
//
//        // 10~1まで出力
//        for (int num = 10; num >= 1; num--)System.out.print(num + "\t");

//        int bar[] = new int[3];
//        for (int i = 0, j = 10; i < bar.length ; i++, j+= 10){
//            bar[i] = j;
//            System.out.println(j); // 10, 20, 30
//        }
//
//        // bar 1次元配列(Array) 内の元素値を出力するコードを作成
//        // 0 1 2
//        for (int i = 0 ; i < bar.length ; i++){
//            System.out.println(i);
//        }

//        int bar[];
//        byte foo[];
//        double pos[]; // pos変数のサイズは4byte
//        boolean kin[]; // kin変数のサイズは4byte
//
//        bar = new int[3];

//        double pos;
//
//        double bar [];
//        bar = new double[3];

//        int bar[];
//        bar = new int[10];
//        bar[3] = 20;
//        bar = new int[8];

//        int bar[] = new double[10];
//        bar[2] = 10.0;
//        System.out.println(bar[2] + 3);

        int bar[] = new int[5];

        // 5 4 3 2 1
        for (int index = 0, value = 5; index < bar.length; index++, value--){
            bar[index] = value;
        }

        for(int value : bar){
            System.out.println(value);
        }

        for (int index = 0 ; index < bar.length; index++){
            System.out.println(bar[index]);
        }

        bar[0] = 5;
        bar[1] = 4;
        bar[2] = 3;
        bar[3] = 2;
        bar[4] = 1;









    }
}
