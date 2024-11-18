public class class1015 {
    public static void main(String[] args) {
//
        // int bar = 2;
//        // bar 2 이면 참을 출력
//        if (bar == 2){
//            System.out.println("bar는 2입니다");
//        }
//
//        // 쿄수님 코드　１行の時だけ、｛｝を省略できる、forやelseも同様
//        if (bar == 2) System.out.println("bar");
//
//        if  (bar == 2)
//            System.out.println("bar");
//            System.out.println("foo"); // このようにするとfooが出力される

        //以下のようにもできるが、出力はfooのみ　最新のデータのみ出力される
        // int bar = 3; if (bar == 2)System.out.println("bar"); System.out.println("foo");

        // code group or black
//        int bar = 2;
//        if  (bar == 2){System.out.println("bar");System.out.println("foo"); } // このようにすればどちらも出力される

//        int bar = 2;
//        if  (bar == 2){
//            System.out.println("bar");
//            int foo = 5;
        // ここに追加する　System.out.println(foo);
//        }
    // System.out.println(foo); //これは不可　if内のことはif内で解決しなくてはいけない

        int kai = 5;
        if (kai % 2 == 0){
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
