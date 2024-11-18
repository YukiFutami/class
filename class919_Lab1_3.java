import java.util.Scanner;
public class class919_Lab1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scan.nextInt();
        // 年齢をintからfloatに変換
        float ageFl = (float) age;
        //System.out.println("You are " + ageFl + " years old.");

        System.out.print("Height: ");
        float height = scan.nextFloat();
        // 身長をfloatからintに変換
        int heightInt = (int) height;

        System.out.print("Credit: ");
        int credit = scan.nextInt();
        // クレジットスコアをintからfloatに変換
        float creditFl = (float) credit;

        // 合計
        int total = age + credit;
        float totalFl = (ageFl + height + creditFl) / 3;

        System.out.println("Total is: " + total);
        System.out.printf("Total is: %.2f\n", totalFl);


    }
}
