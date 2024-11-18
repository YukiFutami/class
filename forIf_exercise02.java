import java.util.Random;

public class forIf_exercise02 {
    public static void main(String[] args){

        // 問題 2: 配列内の重複要素の検出
        //問題:
        //長さ 10 の整数配列 array を用意して任意の整数を入力します。
        //その後、重複している要素があるかどうかを for 文と if 文で確認し、重複が見つかった場合、その数を表示してください。
        //
        //ヒント:
        //入力用の配列を作成して、ユーザーから値を入力させます。
        //for 文を使って、重複する要素があるかをチェックします。
        //出力例:
        //配列の要素を入力してください:
        //1 4 2 7 5 2 8 4 9 0
        //重複している数: 2, 4

        Random rd = new Random();
        int[] array = new int[10];

        // 配列にランダムな整数を入力
        System.out.println("配列: ");
        for(int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(10);
            // 配列の内容を表示
            System.out.print(array[i] + ":\t");
        }

        // このやり方の表示方法もある
//        System.out.println("\n配列: ");
//        for(int value : array){
//            System.out.print(value + ":");
//        }
//        System.out.println();

        // 重複を確認して表示
        System.out.println("\n重複している数: ");

        // 巣で表示した数字を記録するための配列
        boolean[] visited = new boolean[10];

        //　重複確認
        for(int i = 0; i < array.length; i++){
            boolean duplicate = false; // 重複を示すフラグ
            for(int j = 0; j < i ; j++){
                if(array[i] == array[j]){ // iに対してjを周回させ重複確認
                    duplicate = true;
                    break; //　重複が見つかったらその時点でチェックを終了
                }
            }
            //重複している数字を出力
            if(duplicate && !visited[array[i]]){
                System.out.print(array[i] + ":\t");
                visited[array[i]] = true; // その数字を表示済みとして記録
            }
        }
    }
}
