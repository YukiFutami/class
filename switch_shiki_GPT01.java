public class switch_shiki_GPT01 {
    public static void main(String[] args){

        /*
        問題 1: 曜日出力（基本問題）
1~7の整数を入力し、対応する曜日をswitch式を使って出力するプログラムを作成してください。

例:
入力: 1 → 出力: 月曜日
入力: 6 → 出力: 土曜日
ヒント:
1→"月曜日", 2→"火曜日", ..., 7→"日曜日"。

         */
        int day = 5;


        String date = switch(day){
            case 1: yield "月";
            case 2: yield "火";
            case 3: yield "水";
            case 4: yield "木";
            case 5: yield "金";
            default: yield "Error";
        };
        System.out.println("You choice is :" + date);
    }


}
