import java.util.Random;

public class class1107 {
    public static void main(String[] args){

//        Random random1 = new Random(12345);
//        Random random2 = new Random(12345);
//
//        System.out.println("random1:" + random1.nextInt());
//        System.out.println("random2:" + random2.nextInt());
//
//
//        Random bar = new Random(23);
//        // Seed value is 23
//
//        for (int i = 0; i < 5; i++){
//            double foo = Math.random(); // なぜdouble型なのか（Math.randomは0.1~1.0の間までだから）
//            System.out.println(foo);
//        }

//         for (int i = 0; i < 5; i++){
//            double foo = Math.random() * 45 ; // 0.0 <= R < 45.0
//            System.out.println(foo);
//        }
//        for (int i = 0; i < 5; i++){
//            double foo = (int)(Math.random() * 45) ;
              // 0 <= R < 45 -> 0 <= R <= 44
//            System.out.println(foo);
//        }
//
//        for (int i = 0; i < 5; i++){
//            double foo = Math.random() * 45 + 1; //こうすることで４６までの範囲となる
//            System.out.println(foo);
//        }
//
//        // int型に変換すると 0 から 9 の整数値になる。
//        // 必ず 1 以上にしたい場合は +1 を加える。 intに変換した場合は０の結果になるため
//        for (int i = 0; i < 3; i++){
//            double kin = (int)(Math.random() * 10);
//            System.out.println(kin);
//        }

        // 小数点をなくす場合
        for (int i = 0; i < 5; i++){
            double foo = Math.random() * 10;
            int rin = (int) foo;
            System.out.println(rin);
        }


    }
}
