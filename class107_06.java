public class class107_06 {
    public static void main(String[] args) {

        // GPTの練習問題
        // 次の16進数の値を右シフトしなさい（3ビットシフト）。
        // I = 0xC8

        int i = 0xC8;
        int number = (i >> 3) & 0xFF; // 8bits以内に抑えるために0xFFを使う
        System.out.println(Integer.toBinaryString(number));
    }
}
