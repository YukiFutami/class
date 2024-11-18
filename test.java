import java.util.Random;

public class test {
    public static void main(String[] args){

        Random rd = new Random();
        int points = 0; // 獲得ポイントの初期化
        int rdArray;

        // 演算子Arrayの生成
        char[] array = {'*', '+', '-'};

        // ランダムに３つ選択し表示する
        char[] selected = new char[3];

        // arrayの中からランダムに３つ選択し、まとめて表示する
        for(int i = 0; i < 3; i++){
            rdArray = rd.nextInt(array.length);
            selected[i] = array[rdArray];
            System.out.print(selected[i]);
            if(i < 2) { // 最後の演算子後に「:」を表示しない
                System.out.print("  :  ");
            }
        }

        // 連続した演算子の場合スコア発生
        for(int i = 0; i < selected.length; i++){
            int count = 1; // 同じシンボルが連続して現れる回数をカウント

            // 連続した同じシンボルがある場合
            while(i + 1 < selected.length && selected[i] == selected[i + 1]){
                count++;
                i++; // 次のシンボルへ移動
            }

            // 連続したシンボルが３回出た場合
            if(count == 3){
                if(selected[i] == '+'){
                    points += 3;
                } else if(selected[i] == '-'){
                    points -= 3;
                } else if(selected[i] == '*'){
                    points += 5;
                }
            }
            // 連続したシンボルが２回出た場合
            else if(count == 2){
                if(selected[i] == '+'){
                    points++;
                } else if(selected[i] == '-'){
                    points--;
                } else if(selected[i] == '*'){
                    points += 2;
                }
            }
        }

        System.out.println("\n獲得ポイント: " + points);
    }
}
