import java.util.Random;
import java.util.Scanner;

public class mdExam {
    public static void main(String[] args){

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int points = 0; // 獲得ポイントの初期化
        int rdArray;
        int round = 1; //　ラウンド番号

        // 演算子Arrayの生成
        char[] array = {'*', '+', '-'};

        //ゲームスタート
        while(true) {
            System.out.println("\n" + round + "番目のゲーム");

            System.out.print("ゲームを開始します、入力してください: ");
            sc.nextLine(); //任意の入力を待つ

            // ランダムに３つ選択し表示する
            char[] selected = new char[3];

            // arrayの中からランダムに３つ選択し、まとめて表示する
            for (int i = 0; i < 3; i++) {
                rdArray = rd.nextInt(array.length);
                selected[i] = array[rdArray];
                System.out.print(selected[i]);
                System.out.print("  :  ");
            }

            // 連続した演算子の場合スコア発生
            for (int i = 0; i < selected.length; i++) {
                int count = 1; //同じシンボルが連続して現れる回数をカウント

                while (i + 1 < selected.length && selected[i] == selected[i + 1]) {
                    count++;
                    i++;
                }

                // 連続したシンボルが２回以上出た場合にポイントを加算

                if (count == 3) {
                    if (selected[i] == '+') {
                        points += 3;
                    } else if (selected[i] == '-') {
                        points -= 3;
                    } else if (selected[i] == '*') {
                        points += 5;
                    }
                } else if (count == 2) {
                    if (selected[i] == '+') {
                        points++;
                    } else if (selected[i] == '-') {
                        points--;
                    } else if (selected[i] == '*') {
                        points += 2;
                    }
                }
            }
            System.out.println("\n獲得ポイント: " + points);

            //　判定
            if(points >= 5){
                System.out.println("勝利！");
                break;
            } else if(points <= -5){
                System.out.println("敗北!");
                break;
            }

            round++;
        }
        sc.close();
    }
}
