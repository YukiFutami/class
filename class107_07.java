public class class107_07 {
    public static void main(String[] args) {

        // GPTの練習問題
        // 次の式を計算しなさい。
        // J = 0x2A & 0x1F | 0x04

//        int j = 0x2A & 0x1F | 0x04;
//        int number = j;
//        System.out.println(Integer.toBinaryString(number));
        // これでもOKだけど

        int jj = 0x2A & 0x1F;
        int answer = jj | 0x04;
        System.out.println(Integer.toBinaryString(answer));

    }
}
