import java.util.Scanner;

public class spClass {
    public static void main(String[] args){

        // アルファベットを入力し、小文字なら大文字に、大文字なら小文字を出力する
        // int型の整数で（文字に振られた数字）計算し出力する方法

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a letter (a - z or A - Z):");
        char value = scan.next().charAt(0); //1文字目の入力を取得

        if (value >= 'a' && value <= 'z'){ //小文字を大文字に変換
            value = (char)(value - 'a' + 'A');
        } else if (value >= 'A' && value <= 'Z') { //大文字を小文字に変換
            value = (char) (value + 'a' - 'A'); // 例えばaを入力したとき、value(a) - a + A となりAだけが残る
        }

        System.out.println("Converted letter :" + value);
        scan.close();
    }
}
