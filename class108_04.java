

public class class108_04 {
    public static void main(String[] args){

        // IPアドレスをビットシフト演算で作成
        int ip = (192 << 24) | (168 << 16) | (1 << 8) | 10;
        // サブネットマスクをビットシフト演算で作成
        int subnetMask = (255 << 24) | (255 << 16) | (255 << 8) | 0;

        // ネットワークアドレスを計算
        int networkAddress = ip & subnetMask;

        // 結果を表示
        System.out.println("IP Address: " + ipToString(ip));
        System.out.println("Subnet Mask: " + ipToString(subnetMask));
        System.out.println("Network Address: " + ipToString(networkAddress));
    }

    // IPアドレスを文字列に変換するメゾット
    // >> 演算子を使用して各オクテットを抽出し、& 0xFF で下位8ビットを取得します。これにより、0から255の範囲の値が得られます。
    public static String ipToString(int ip){
        return ((ip >> 24) & 0xFF) + "." + ((ip >> 16) & 0xFF) + "." +
                ((ip >> 8) & 0xFF) + "." + (ip & 0xFF);
    }
}
