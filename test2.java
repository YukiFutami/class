import java.util.Random;
import java.util.Scanner;

//****************再度確認

public class test2 {
    public static void main(String[] args){

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        // １～９のランダムに並べた配列を作成
        // 与えられた配列から順番に数字を選ぶ
        // 選ばれた数字の合計が指定されたターゲット地に到達するかどうかをチェック

        // ターゲット値を生成 10~30
        int target = rd.nextInt(21) + 10;
        System.out.println(target);

        // 1~9の数字はランダムで重複しない
        // １～９のランダムに並べた配列を作成
        int[] array = new int[9];
        for(int i = 0; i < array.length; i++) {
            int rdNum; //  = rd.nextInt(9) + 1;

            // 重複のチェック
            while (true){
                rdNum = rd.nextInt(9) + 1;
                boolean isDuplicate = false;

                for (int j = 0; j < i; j++) {
                    if (array[j] == rdNum) {
                        isDuplicate = true;
                        break;
                    }
                }
                if(!isDuplicate) break;
            }
            array[i] = rdNum; // 重複していなければ代入
        }

        // 結果の表示
        System.out.println("ランダム配列: ");
        for(int num : array){
            System.out.print(num + " : ");
        }
        System.out.println();

        // 現在地
        int points = 0;
        // 差分
        int diff;
        boolean[] used = new boolean[9];

        // プレイヤーが数字を選ぶ
        // 数字を選んだ後、次に選ぶべき数字（ターゲットとの差分）を表示
        while (true){
            System.out.println("indexを選ぶ");
            int index = sc.nextInt();

            if(index < 0 || index >= array.length || used[index]){
                System.out.println("該当indexがありません、再入力してください");
                continue;
            }

            //使用
            System.out.println("選んだ数" + array[index]);
            points += array[index]; // 現在のポイント＋新しいポイント＝合計ポイント
            used[index] = true;

            diff = target - points;
            System.out.println("現在の差分: " + diff);


            // ターゲットを超えた場合、ループを抜け出す
            if(points >= target){
                break;
            }
        }

        // ターゲットと同じなら勝利、超えたら敗北
        if (target == points){
            System.out.println("勝利");
        } else {
            System.out.println("敗北");
        }
        sc.close();
    }
}
