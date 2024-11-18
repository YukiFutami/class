public class switch_shiki_GPT02 {
    public static void main(String[] args){

        /*
        問題 2: 成績判定（条件付き処理）
次のような成績に基づいてメッセージを出力するプログラムを作成してください。

A → 「素晴らしいです！」
B → 「良い結果です！」
C → 「もう少し頑張りましょう」
D, F → 「再試験が必要です」
switch式を使い、ユーザーから1文字の成績を入力させて適切なメッセージを表示してください。

         */

        char score = 'A';

        String result = switch (score){
            case 'A'-> "素晴らしいです！";
            case 'B'-> "良い結果です！";
            case 'C'-> "もう少し頑張りましょう";
            case 'D', 'F'-> "再試験が必要です";
            default -> "Error";
        };

        System.out.println("You score is " + result);


    }
}
