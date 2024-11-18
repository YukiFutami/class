public class switch_shiki_GPT03 {
    public static void main(String[] args){

        /*

問題 3: 月の季節判定（複数条件）
ユーザーが1~12の月を入力したとき、その月が属する季節をswitch式で判定してください。

3, 4, 5月 → 「春」
6, 7, 8月 → 「夏」
9, 10, 11月 → 「秋」
12, 1, 2月 → 「冬」
ヒント:

caseの後に複数の月を並べて、同じ処理を実行するようにします。
         */

        int month = 12;

        String season = switch (month){
            case 3, 4, 5 -> "春";
            case 6, 7, 8 -> "夏";
            case 9, 10, 11 -> "秋";
            case 12, 1, 2 -> "冬";
            default -> "Error";
        };

        System.out.println(month + "is" + season);

    }
}
