public class class919 {
    public static void main(String[] args) {
//
//        float bar = 2.0f;
//
//        long foo = 10;
//
//        float pos = (float)(1/2); // 結果は0.5だがfloatのため小数点が切り捨てられている
//        System.out.println(pos); // 0.0
//
//        float poss = 1.0f / 2 ; // １つを小数点に変換する、2はintなので0.5の結果となる
//        System.out.println(poss); // 0.5
//
//        // 型変換(Type casting)
//        double kin = (double)2;
//        double sun = 3;
//        // 小さいから大きいときは不要、大きいから小さくするときは必要
//        double kinn = 2;
//        float sunsun = (float)kinn;
//        System.out.println(sunsun);

//        // AからZまで画面に出力
//        for (char bar ='A'; bar <= 'Z'; bar+=2){
//            System.out.print(bar + "\t");
//        }
//        System.out.println();
//        // ZからＡまで画面に出力
//        for (char kin ='Z'; kin >= 'A'; kin--){
//            System.out.print(kin + "\t");
//        }
//        System.out.println();

//        int a = 10;
//        int b = -5;
//        System.out.println("基本演算子の例題");
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " + (a - b));
//        System.out.println("a * b = " + (a * b));
//        System.out.println("a / b = " + (a / b));
//
//        int positive = +a;
//        int negative = -a;
//        System.out.println("正数: +"+ a + "=" + positive);
//        System.out.println("負数: -"+ a + "=" + negative);
//
//        System.out.println();

        //int bar = 2;
//        bar++;
//        System.out.println(bar);
//        bar--;
//        System.out.println(bar);
//        ++bar;
//        System.out.println(bar);
//        --bar;
//        System.out.println(bar);

//        System.out.println(bar++);
//        System.out.println(++bar);
//        System.out.println(bar);

        /*
        System.out.println(bar++);
        System.out.println(++bar);
        System.out.println(bar);
        このコードは
        System.out.println(bar++);　// 2 コード終わりに3になり
        System.out.println(++bar); // 4　実行すると３に１追加され４になる
        System.out.println(bar);　// 4　値の追加がないため4が出力される
         */

//        System.out.println(++bar);
//        System.out.println(bar++);
//        System.out.println(bar);
        /*
        このコードは
        System.out.println(++bar);　// 3 １に２が追加される
        System.out.println(bar++);　// 3 ３が出力され、次の実行に１が追加される
        System.out.println(bar);　// 4 前のコードで４になっているため４が出力される
         */

        String str1 = "Heloo";
        String str2 = "Heloo";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
