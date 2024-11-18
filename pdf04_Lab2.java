import java.util.Scanner;

public class pdf04_Lab2 {
    public static void main(String[] args){

        // 1~7までの整数を入力、該当数字に合う曜日を出力
        // 間違った数字の場合、メッセージを出力し、再入力に促す
        // 土曜日、日曜日は週末、そのほかは平日と区分して出力、出力は、曜日と週末か平日

        // switchを使いケースで１～７までを作利用日を振り分ける
        // さらにそのなかで週末と平日に分ける

        // 入力
        Scanner scan = new Scanner(System.in);

        // label
        String outputDate = "";
        String dayType = "";

        while (true){
            System.out.print("1~7 사이의 숫자를 입력하세요: ");
            int date = scan.nextInt();

            if (date >= 1 && date <= 7){
                switch (date){
                    case 1:
                        outputDate = "월요일";
                        dayType = "평일";
                        break;
                    case 2:
                        outputDate = "화요일";
                        dayType = "평일";
                        break;
                    case 3:
                        outputDate = "수요일";
                        dayType = "평일";
                        break;
                    case 4:
                        outputDate = "목요일";
                        dayType = "평일";
                        break;
                    case 5:
                        outputDate = "금요일";
                        dayType = "평일";
                        break;
                    case 6:
                        outputDate = "토요일";
                        dayType = "주말";
                        break;
                    case 7:
                        outputDate = "일요일";
                        dayType = "주말";
                        break;
                }
                // 出力とループ終了
                System.out.println(outputDate + "," + dayType);
                break;
            } else {
                System.out.println("유효하지 않은 숫자입니다. 1~7 사이의 숫자를 입력하세요.");
            }
        }
        scan.close();
    }
}
