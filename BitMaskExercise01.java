public class BitMaskExercise01 {
    public static void main(String[] args){
        // 問題1: IPアドレスのマスキング
        // 次のIPアドレスから、サブネットマスク 255.255.255.0 を使ってネットワークアドレスを求めなさい。
        // IPアドレス: 192.168.1.100

        // IPアドレスの１６進数
        int IpAddr = 0xC0A80164;
        // マスク値の作成
        int mask = 0xFFFFFF00;

        // ＆演算
        int maskedIpAddr = IpAddr & mask;
        System.out.printf("maskedIpAddr : %d.%d.%d.%d%n",
                (maskedIpAddr >> 24) & 0xFF,
                (maskedIpAddr >> 16) & 0xFF,
                (maskedIpAddr >> 8) & 0xFF,
                maskedIpAddr & 0xFF
        );
    }
}
