public class class107_04 {
    public static void main(String[] args) {

        // GPTの練習問題
        // 次の16進数の値をビット反転（NOT演算）しなさい。
        // G = 0xF3

        int g = 0xF3;

        // ２進数
        System.out.println(Integer.toBinaryString(g));

        // ~を求める（反転）　１の補数
        int number = ~g;
        System.out.println(g);

        // 2進数
        System.out.println(Integer.toBinaryString(number));

        //　２の補数　+ 1
        int answer = number + 1;
        System.out.println(Integer.toBinaryString(answer));

    }
}
