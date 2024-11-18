import java.util.Scanner;

public class switch_shiki_GPT04 {
    public static void main(String[] args){

        /*
        問題 4: 電車料金の計算（応用）
ユーザーが選択した電車の乗車区分に応じて、料金を計算するプログラムをswitch式で作成してください。

区分	料金
子供	500円
学生	800円
一般	1000円
シニア	600円
要件:

ユーザーが"child", "student", "adult", "senior"のいずれかを選択します。
選択された区分に応じて、料金をswitch式で計算し、出力してください。

         */
        Scanner scan = new Scanner(System.in);
        String ticket = scan.next().toLowerCase();

        String value = switch(ticket){
            case "child" -> "500";
            case "student" -> "800";
            case "adult" -> "1000";
            case "senior" -> "600";
            default -> "Error: 入力が間違っています";
        };


        System.out.println(value);
        scan.close();



    }

}
