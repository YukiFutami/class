public class class108 {
//    static String getBinaryValue(int argValue){
//
//        int result =
//
//    }

    public static void main(String[] args){
        int bar = 0x000000ff;
        int foo = 0b11111111;
        int kin = 255;

        System.out.println(bar + ":" + foo + ":" + kin);
        System.out.println(Integer.toBinaryString(bar));
        System.out.println(Integer.toBinaryString(foo));
        System.out.println(Integer.toBinaryString(kin));

        int ban = 0b01001010111000100000000011111111;
        int mask = 0x00ff0000;

        int result = ban & mask;
                // 0000 0000 1110 0010 0000 0000 0000 0000
        System.out.println(result);
        /*
        このコードは、ビット演算を使って特定のビットを抽出するためのものです。以下に詳細に解説します。

コードの説明
java

int ban = 0b01001010 1110 0010 0000000011111111;
int mask = 0x00ff0000;

int result = ban & mask; // ビットAND演算
System.out.println(result);
1. 変数の定義
int ban = 0b01001010111000100000000011111111;
この行は、2進数での数値を表していますが、実際にはスペースは使用できません。正しい形式は 0b01001010111000100000000011111111 です。この数は10進数で 124284671 に相当します。

int mask = 0x00ff0000;
この行は、16進数でのマスクを定義しています。0x00ff0000 は、10進数で 16711680 に相当します。バイナリ形式で表すと、00000000 11111111 00000000 00000000 となります。

2. ビットAND演算
java
int result = ban & mask;
この行では、ban と mask のビットAND演算を行います。
ビットAND演算は、同じ位置にあるビットが両方とも1のときにのみ1を返し、それ以外は0を返します。

3. 具体的なビット演算の例
バイナリ形式での計算は以下の通りです：
ban:  01001010 1110 0010 00000000 11111111
mask: 00000000 11111111 00000000 00000000
------------------------------------------
result: 00000000 11111111 00000000 00000000
この結果は 0x00ff0000、すなわち 16711680 になります。

4. 出力
System.out.println(result);
result の値をコンソールに出力します。この場合は 16711680 です。
まとめ
このコードは、ビット演算を使って特定のビットを抽出するためのもので、ban からマスク (mask) によって指定されたビットだけを残す操作を行っています。出力は、mask によって抽出されたビットの結果となります。
         */
//
//        int bak = 0b01001010111000100000000010111011;
//        // Get : 특기 자리의 비트 값 입력
//        //     - 비트 자리 수
//        int bitPosition = 30; //bit 範囲は31 ~ 0
//        int maskk = 0b01000000000000000000000000000000;
//
//        boolean resultt = (bak & maskk) != 0;
//        int resultInt = (bak & maskk) != 0 ? 1 : 0;
//
//        // Set : 특정 자리에 비트 값 쓰기
//        //     - 비트 자리 수, 값


    }
}
