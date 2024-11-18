import java.util.Scanner;

public class class910_Lab1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 年齢
        System.out.print("年齢: ");
        String ageInput = scan.nextLine();
        // 身長
        System.out.print("身長: ");
        String heightInput = scan.nextLine();
        // クレジット
        System.out.print("Credit: ");
        String creditInput = scan.nextLine();

        int age = Integer.parseInt(ageInput);
        float height = Float.parseFloat(heightInput);
        int credit = Integer.parseInt(creditInput);
        System.out.println("合計: " + (age + credit));

        // System.out.printf("%.2f メートル\n", height);
        float average = (age + credit + height) / 3;
        System.out.printf("平均: %.2f", average);
    }
}
