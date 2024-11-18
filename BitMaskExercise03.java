public class BitMaskExercise03 {
    public static void main(String[] args){
        // 問題3: 特定のビットを設定
        // 次の数値に対して、特定のビットを1に設定するプログラムを書きなさい。
        // 具体的には、0x4A（10進数で74）の4ビット目を1に設定しなさい。

        // 値
        int kan = 0x4A;

        // マスクするコードを作成 4ビット目をいったん０にする
        int mask = 0x08;

        // ４ビット目を１に設定する
        int maskedkan = kan | mask;




    }
}
