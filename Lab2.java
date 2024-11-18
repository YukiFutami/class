public class Lab2 {
    public static void main(String[] args) {
        byte maxValue = 127;
        byte minValue = -128;

        maxValue++; //maxValue++는 127에서 1을 더하면 byte형 반위를 초과하여 오버플로우가 발생함
        minValue--; //minValue--는 -128에서 1을 뺴면 byte형 반위를 초과하여 언더플로우가 발생함

        System.out.println("overflowed: " + maxValue);
        System.out.println("underflowed: " + minValue);
    }
}

