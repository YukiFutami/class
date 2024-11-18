import java.util.Random;

public class forIf_exercise01 {
    public static void main(String[] args){

        // 問題 1: 重複を避けたランダム数の配列
        //問題: 長さ 10 の配列 array を作成し、0 から 9 までのランダムな整数を重複しないように代入してください。
        // for 文と if 文のみを使用して、重複チェックを行ってください。

        //ヒント:
        //for 文内で新しいランダムな数を生成します。
        //生成した数がすでに配列に存在するかを確認します。
        //重複が見つかった場合、新しいランダムな数を再度生成します。
        //出力例: 5 3 1 7 0 4 8 2 6 9

        Random rd = new Random();

        // 配列を初期化
        int[] array = new int[10];

        // ランダム値を生成し配列に入れる
        for(int i = 0; i < array.length; i++){
            int rdNum = rd.nextInt(10);

            // 重複確認
            for(int j = 0; j < i; j++){
                if(array[i] == rdNum){
                    rdNum = rd.nextInt(10);
                    j = -1;
                }
            }
            array[i] = rdNum;
            System.out.print(array[i] + ":\t");
        }
        System.out.println();
        for(int num : array){
            System.out.print(num + ":\t");
        }
    }
}
