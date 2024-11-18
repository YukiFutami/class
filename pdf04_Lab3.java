import java.util.Scanner;

public class pdf04_Lab3 {
    public static void main(String[] args) {

        //　学生の成績等級と出席等級の入力を受け、奨学金支給可否と推薦事項を決定する
        // switch expression and yield を使う

        // 成績がA　出席がexcellentの場合：＂전액장학금 및 추가 지원금 지급”　浅学支給と追加支援金支給
        // 成績がA　出席がAverageの場合：＂전액장학금“　全額支給
        // 成績がB　出席がExcellentの場合： "반액장학금“　半額奨学金
        // 成績がC,Dの場合
        // 出席が Poorの場合： "장학금없음, 재수강권장”　奨学金なし再受講を勧める
        // 出席が Excellent　もしくは　Average　の場合：　”奨学金なし”
        // 成績がFの場合： "장학금없음, 재수강권장“
        // 間違った入力の場合、エラーメッセージを出力し再度入力　"잘못된입력입니다”

        // 入力　成績はA～F,　出席はExcellent, Average, Poor
        // 入力された文字列はすべて大文字で処理する

        Scanner scan = new Scanner(System.in);

        while(true){
            // 入力
            // 成績
            System.out.println("Enter your score: ");
            char score = Character.toUpperCase(scan.next().charAt(0)); // 小文字を大文字に変換する

            // 出席
            System.out.println("Enter your Attendance late: ");
            String a_late = scan.next().toUpperCase();

            // 条件式
            if (score >= 'A' && score <= 'F' && (a_late.equals("EXCELLENT")) || (a_late.equals("AVERAGE")) ||
                    (a_late.equals("POOR"))){
                break;
            } else {
                System.out.println("잘못된입력입니다, 다시입력 ");
            }

            // 条件式　score
            String type = switch (score){
                case 'A'-> {
                    if (a_late.equals("EXCELLENT")){
                        yield  "전액장학금 및 추가 지원금 지급";
                    } else if (a_late.equals("AVERAGE")) {
                        yield  "전액장학금";
                    } else {
                        yield "なし";
                    }
                }
                case 'B'-> {
                    if (a_late.equals("EXCELLENT")){
                        yield  "반액장학금";
                    } else {
                        yield "Nothing";
                    }
                }
                case 'C', 'D'-> {
                    if (a_late.equals("POOR")){
                        yield  "장학금없음, 재수강권장";
                    } else {
                        yield  "장학금없음";
                    }
                }
                case 'F'-> "장학금없음, 재수강권장";
                default -> "잘못된입력입니다";
            };
            System.out.println("Result : " + type);
            scan.close();
        }
    }
}
