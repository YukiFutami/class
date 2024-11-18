import java.util.Scanner;

public class class910_Lab1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 年齢
        System.out.print("Age: ");
        int ageInput = scan.nextInt();

        // 身長
        System.out.print("Height: ");
        float heightInput = scan.nextFloat();

        // クレジットスコア
        System.out.print("Score: ");
        int scoreInput = scan.nextInt();

        //合計
        int total = ageInput + scoreInput;
        System.out.println("Total :" + total );

        //平均
//        float ageOutput = (int)ageInput;
//        float scoreOutput = (int)scoreInput;

        float average = (ageInput + heightInput + scoreInput) / 3;
        System.out.printf("Average: %.2f\n", average );
    }
}
