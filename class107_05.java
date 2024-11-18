public class class107_05 {
    public static void main(String[] args) {

        // GPTの練習問題
        // 次の16進数の値を左シフトしなさい（2ビットシフト）
        // H = 0x1C

        int h = 0x1C;

        // int number = (h << 2) & 0xFF; 左シフトのなので不要！
        int number = h << 2;
        System.out.println(Integer.toBinaryString(number));


    }
}
