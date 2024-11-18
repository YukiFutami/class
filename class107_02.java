public class class107_02 {
    public static void main(String[] args){

        // GPTの練習問題
        // 次の16進数の値に対してビットOR演算を行いなさい。
        // C = 0xA1  D = 0x4B

        int c = 0xA1;
        int d = 0x4B;

        int number = c | d;
        System.out.println(number);

        // 2進数
        System.out.println(Integer.toBinaryString(number));

    }
}
