import java.util.Scanner;

public class class919_Lab4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 年齢
        System.out.print("Age: ");
        int ageInput = scan.nextInt();

        // 体重
        System.out.print("weight: ");
        double weightInput = scan.nextDouble();

        // AgeをDoubleに変換
        double age = ageInput;
        System.out.println(age);
        double ageWeight = age + weightInput;
        System.out.println(ageWeight);
        System.out.printf("age change is double : %.1f\n" , ageWeight);

        // weightをintに変換
        int weight = (int) weightInput;
        System.out.println(weight);
        int weightAge = ageInput + weight;
        System.out.println(weightAge);
        System.out.println("weight change is int :" + weightAge);

    }
}
