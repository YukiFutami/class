class BitSet{   // メソッド作成
    int state = 0; // 32bitを初期化、最初は全て０にする

    void setBit(int position, boolean value){
        // position位置のbit値を設定 32bitなので０以上３２以下の範囲であることを確認する
        if (position < 0 || position >= 32){
            return; // falseなら終了
        }

        // trueかfalseの判定
        if (value){
            state |= (1 << position); // 指定したpositionだけ１にする, | は１の部分だけ１に、それ以外は０にする
        } else {
            state &= ~(1 << position); // 指定したposition位置を1にし,Not演算子を使って反転、指定位置のみ0にする
        }                              // &は両方のbitが１のみ1で、それ以外は０になる
    }

    // bitの照会
    boolean getBit(int position){
        // position位置のbit値を設定 32bitなので０以上３２以下の範囲であることを確認する　
        // メゾット毎に実行することで間違いをなくす
        if (position < 0 || position >= 32){
            return false ; // boolean型なので戻り値が必要
        }
        return (state & (1 << position)) != 0; // positionの位置に1を設定、それをstateと合わせる
                                               // 特定の位置が１になっていればtrue, ０の場合はfalseとなる
    }
} // メゾット終了
public class OperatorLab1 {
    public static void main(String[] args){
        BitSet bitSet = new BitSet(); // ビットのオン、オフを確認する
        bitSet.setBit(5, true); // setBit呼び出し、positionの位置とvalueを指定
        System.out.println(bitSet.getBit(5));
        System.out.println(bitSet.getBit(3));
    }
}

