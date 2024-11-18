public class class910_Lab3 {
    public static void main(String[] args) {

        // 円の半径
        final double radius = 5.0;
        // 円周率
        final double PI  = 3.14159;

        //円の面積を求める
        double area = PI * radius * radius;

        // 結果の出力、小数点２桁まで
        System.out.printf("円の面積: %.2f\n", area);
    }
}
