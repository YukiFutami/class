import java.util.Scanner;

public class class1031_test4 {
    public static void main(String[] args) {

        // 成績A<B<C 出席 PASS, FAIL
        // A　PASS　전액 + 추가 장학금
        // A FAIL 전액
        // B  PASS 전액
        // 他は　なし

        // 成績の入力
//        char score = 'B';
//
//        // 出席の入力
//        String attend = "PASS";
//
//        // 条件式
//        String scholarship = switch(score){
//            case 'A' :{
//                if (attend.equals("PASS")){
//                    yield "전액 + 추가 장학금";
//                } else if(attend.equals("FAIL")){
//                    yield "전액";
//                }
//            }
//            case 'B':{
//                if (attend.equals("PASS")){
//                    yield "전액";
//                } else {
//                    yield "장학금 없음"
//                }
//            }
//            default : yield "장학금 없음";
//        };

//        System.out.println("너의 등금은:" + scholarship + "입니다");

        Scanner scan = new Scanner(System.in);

        // 入力を受ける、小文字大文字で入力されても判断するのを追加
        System.out.println("Enter your score: ");
        char score = scan.next().toUpperCase().charAt(0);


        // 出席の入力
        System.out.println("Enter you attendance rate: ");
        String attend = scan.next();

        // 条件式
        String scholarship = switch(score){
            case 'A' :{
                if (attend.equalsIgnoreCase("PASS")){
                    yield "전액 + 추가 장학금";
                } else if(attend.equalsIgnoreCase("FAIL")){
                    yield "전액";
                }
            }
            case 'B':{
                if (attend.equalsIgnoreCase("PASS")){
                    yield "전액";
                } else {
                    yield "장학금 없음";
                }
            }
            default : yield "장학금 없음";
        };

        System.out.println("너의 등금은:" + scholarship + "입니다");

        scan.close();
    }
}

