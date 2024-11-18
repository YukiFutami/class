public class class912 {
    public static void main(String[] args) {

        // 最大値 127
        // 最小値 128

        byte bar = 127; //overflow
        bar++; // bar = bar + 1
        System.out.println(bar);

        bar = -128; // underflow
        bar--; // bar = bar -1
        System.out.println(bar);

        long pos = 2147483647 + 2;
        System.out.println(pos);
        //-2147483647 longだがビット数の範疇を超えているため2147...Lとしなくてはいけない
        // 訂正↓ Change variable name to poss
        long poss = 2147483647L + 2;
        System.out.println(poss);

//        long currency = (450 + 3) / 2.0;
//        System.out.println(currency);
        // error doubleの値が含まれているため
        double curren = (450 + 3) / 2.0;
        System.out.println(curren);

        char barr = '1';
        String fooo = "12";
        int posss = 30;
        System.out.println(fooo + posss); //1230 文字列を足しただけの判定
    }
}
