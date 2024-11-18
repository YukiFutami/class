import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 첫 번째 값: 나이
        System.out.print("첫 번째 값(나이 - 정수형): ");
        int AgeInput = scan.nextInt();

        // 두 번째 값: 키
        System.out.print("두 번째 값(키 - 소수점 포함): ");
        double heightInput = scan.nextDouble();

        // 세 번째 값: 신용점수
        System.out.print("세 번째 값(신용점수 - 정수형): ");
        int CreditInput = scan.nextInt();

        // 힙계
        double total = AgeInput + heightInput + CreditInput;
        System.out.println("합계: " + total);

        // 평균
        double average = total / 3;
        System.out.printf("평균: %.14f\n", average);

        scan.close();
    }
}
