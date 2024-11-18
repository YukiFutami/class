public class class107_01 {
    public static void main(String[] args){

        // GPTの練習問題
        // 次の16進数の値に対してビットAND演算を行いなさい。
        // A = 0x5A B = 0x3F

        int a = 0x5A;
        int b = 0x3F;

        int number = a & b;
        System.out.println(number);

        // 2進数にしたいとき
        System.out.println(Integer.toBinaryString(number));


    }
}
