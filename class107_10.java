public class class107_10 {
    public static void main(String[] args){

        // GPTの練習問題
        // 次の16進数の値に対してビットOR演算を行い、結果を16進数で表示しなさい。
        // N = 0x9C  O = 0x47

        int n = 0x9C;
        int o = 0x47;
        int number = n | o;

        // 16進数
        System.out.println(Integer.toHexString(number));

        // 10進数
        System.out.println(number);

        // 2進数
        System.out.println(Integer.toBinaryString(number));

    }
}
