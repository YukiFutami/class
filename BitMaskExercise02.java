public class BitMaskExercise02 {
    public static void main(String[] args){
        // 問題2: ビットマスクの演算
        // 次の16進数の値に対してビットAND演算を行い、その結果を10進数で表示しなさい。
        // A = 0xFF00FF00  B = 0x00FF00FF

        // すでにビットマスクされた値
        int a = 0xFF00FF00;
        System.out.println(Integer.toBinaryString(a));
        int b = 0x00FF00FF;
        System.out.println(Integer.toBinaryString(b));
        int number = a & b;
        System.out.println(number);
    }
}
