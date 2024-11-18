import java.util.Scanner;

public class class910_Lab4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 年齢
        System.out.print("年齢: ");
        String age = scan.nextLine();
        int ageInt = Integer.parseInt(age);
        double ageDouble = Double.parseDouble(age);

        // 体重
        System.out.print("体重: ");
        String weight = scan.nextLine();
        double weightInt = Double.parseDouble(weight);
        int wightDD = Integer.parseInt(weight);

        double ageOut = ageDouble + weightInt;
        int weightOut = Integer.parseInt(weight);

        System.out.printf("Double: %.2f\n", ageOut);
        System.out.printf("Int:", weightOut);
    }
}
