public class class107_03 {
    public static void main(String[] args) {

        // GPTの練習問題
        // 次の16進数の値に対してビットXOR演算を行いなさい
        // E = 0x7C   F = 0x1E

        int e = 0x7C;
        int f = 0x1E;

        int number = e ^ f;
        System.out.println(number);

        // ２進数
        System.out.println(Integer.toBinaryString(number));
    }
}

