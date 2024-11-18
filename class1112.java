public class class1112 {
    public static void main(String[] args){


        int size = 5;
        char[][] grid = new char[size][size];

        // 配列を初期化して、すべての要素に '*' を埋める
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '*';
            }
        }

        // 右上から左下の対角線の星を削除（空白に置き換え）
        for (int i = 0; i < size; i++) {
            grid[i][i] = ' '; // size - 1 - i
        }

        // 結果を表示
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // 各行の終わりで改行
        }


    }
}
