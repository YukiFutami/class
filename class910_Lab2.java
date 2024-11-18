public class class910_Lab2 {
    public static void main(String[] args) {
        byte maxValue = 127;
        byte minValue = -128;

        maxValue++;
        minValue--;

        System.out.println("overflowed: " + maxValue);
        System.out.println("underflowed: " + minValue);
    }
}

/*
最大値 (maxValue) のオーバーフロー:
byte 型の最大値は 127 です。
maxValue++ で 127 に 1 を加えると、byte 型の範囲を超えてしまいます。
オーバーフローが発生し、値は -128 にラップアラウンドします（byte 型の最小値に戻ります）。

最小値 (minValue) のアンダーフロー:
byte 型の最小値は -128 です。
minValue-- で -128 から 1 を引くと、byte 型の範囲を下回ってしまいます。
アンダーフローが発生し、値は 127 にラップアラウンドします（byte 型の最大値に戻ります）。

結果の出力
overflowed: -128:
maxValue が 127 から 1 増加して -128 になったことを示しています。オーバーフローによって値が最小値に戻りました。
overflowed: 127:
minValue が -128 から 1 減少して 127 になったことを示しています。アンダーフローによって値が最大値に戻りました。
*/
