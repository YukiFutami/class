import java.util.Scanner;

public class pdf04_Lab1 {
    public static void main(String[] args){

        // 使用者の年齢を入力基準に、年齢層に合うメッセージを出力
        // ただし、負の数を入力されたとき、エラーのメッセージを出力し、再度入力するように促す

        // 年齢層の確認
        // 正の数ならbreakで抜け出す
        // 負の数ならメッセージを出力し再度入力してもらう

        Scanner scan = new Scanner(System.in);

        // message
        String label = "";

        while (true){
            // 입력
            System.out.print("나이를 입력하세요: ");
            int age = scan.nextInt();

            // 조건식
            if (age >= 65){
                label = "노인";
                break;
            } else if (age >= 18) {
                label = "성인";
                break;
            } else if (age >= 13) {
                label = "청소년";
                break;
            } else if (age >= 0){
                label = "어린이";
                break;
            } else {
                System.out.println("나이는 음수가 될 수 없습니다");
                continue; // 再入力の意図が明確になる、コードの視覚化
            }
        }
        // message 표시
        System.out.println(label);

        scan.close();
    }
}
