public class Lab3 {
    public static void main(String[] args) {

        // 원의 반지름을 저장
        final double radius = 5.0;

        // 원주율(π)을 상수로 선언
        final double PI = 3.14159;

        // 원의 면적
        double area = PI * radius * radius;
        System.out.printf("원의 면적: %.2f\n", area);
    }
}
