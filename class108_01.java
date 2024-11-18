public class class108_01 { //ビット演算子
    public static void main(String[] args){
        int a = 8;
        System.out.println(a);
        int b = 3;
        System.out.println(b);

        int resultAnd = a & b;
        System.out.println(resultAnd);

        int resultOr = a | b;
        System.out.println(resultOr);

        int resultXor = a ^ b;
        System.out.println(resultXor);

        int resultNot = ~a;
        System.out.println(resultNot);

        int resultNot2 = ~b;
        System.out.println(resultNot2);

        int resultLeftShift = a << 1;
        System.out.println(resultLeftShift);
        System.out.println(Integer.toBinaryString(resultLeftShift)); //2進数

        int resultRightShift = a >> 1;
        System.out.println(resultRightShift);
        System.out.println(Integer.toBinaryString(resultRightShift)); // 2進数

        int resultRight = a >>> 1;
        System.out.println(resultRight);
        System.out.println(Integer.toBinaryString(resultRight)); // 2進数
    }
}
