import java.util.Scanner;

public class class910_Lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("年齢を入力: ");
        String ageInput = scan.nextLine();
        int age = Integer.parseInt(ageInput);

        System.out.print("体重を入力: ");
        String heightInput = scan.nextLine();
        double height = Double.parseDouble(heightInput);

        // 年齢をdoubleに変換し、体重と加算結果を出力
        double agedb = age;
        double ageHeight = height + agedb;
        System.out.printf("年齢をdoubleに変換して体重と合計した結果: %.1f\n", ageHeight);

        //　体重をintに変換し、年齢と加算結果を出力
        int wight = (int)height;
        int ageWight = wight + age;
        System.out.println("体重をintに" +  ageWight);
    }
}
