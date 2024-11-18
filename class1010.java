public class class1010 { // 先生のコードコピー（配布:distribution）

    static String getBinaryValue(int argValue) {
        String binaryString = Integer.toBinaryString(argValue);

        // 32비트 int 값을 4자리씩 출력하기 위해 앞쪽에 필요한 만큼 0 추가
        binaryString = String.format("%32s", binaryString).replace(' ', '0');

        String result = "";

        // 4자리씩 끊어서 출력
        System.out.println("Binary representation (4 bits per group):");
        for (int i = 0; i < binaryString.length(); i += 4) {
            result += binaryString.substring(i, i + 4) + " ";
        }

        return result;
    }


    public static void main(String[] args) {


//        int bar = 0b00000000000000000000000000000001; // １が末尾にいる、左に移動し、移動後の１の位置が２進数の何乗か確認できる
//        int result = bar << 2;
//        System.out.println(getBinaryValue(result) + " : " + result);
//
//        result = bar << 2;
//        System.out.println(getBinaryValue(result) + " : " + result);
//
//        result = bar << 4;
//        System.out.println(getBinaryValue(result) + " : " + result);

        int foo = 0b1000000000000000000000000000000; // １が先頭にある　右にシフトするとマイナス値になる
        int answer = foo >> 3; // マイナスになるはず？　
        System.out.println(getBinaryValue(answer) + " : " + answer);

        answer = foo >>> 3; // >>> は必ず正の値
        System.out.println(getBinaryValue(answer) + " : " + answer);

        answer = foo >> 4;
        System.out.println(getBinaryValue(answer) + " : " + answer);




    }
}


