import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 나이
        System.out.print("나이를 입력하세요: ");
        int ageInput = scan.nextInt();

        // 몸무게
        System.out.print("몸무게를 입력하세요: ");
        double weightInput = scan.nextDouble();

        // 나이를 double로 변환
        double ageAsDouble = ageInput;
        double ageWeightSum = ageAsDouble + weightInput;
        System.out.printf("나이를 double로 변환한 후 몸무게와 더한 결과 : %.1f\n" , ageWeightSum);

        // 몸무게를 int로 변환
        int weightAsInt = (int) weightInput;
        int weightAgeSum = ageInput + weightAsInt;
        System.out.println("몸무게를 int로 변환한 후 나이와 더한 결과:" + weightAgeSum);

        scan.close();
    }
}

