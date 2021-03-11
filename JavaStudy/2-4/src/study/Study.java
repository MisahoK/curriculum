package study;

//①FruitsConstants.javaをインポートしなさい。
//constantsパケのFruitsConstantsクラスの定数（メンバ）を全てインポートする。
import static constants.FruitsConstants.*;

//②Fruits.javaをインポートしなさい。
import fruits.Fruits;

/**
* 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
*
* 問①〜問③まであります。
* 全て回答し、課題にある画像と同じ表示になるようにしてください。
*
*/
public class Study {
    public static void main(String[] args) {

        /* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
         *     また、課題の画像と同じ表示になるように
         *     printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください。
         */

        //定数クラスからインポートした定数をprintFruitsメソッドの変数に代入
        String fruits = FRUITS_LEMON_04;
        int count = FRUITS_COUNT_20;

        //printFruitsはFruitsクラスで定義されているから、
        //そのまま引数に入れて「（インポートした）FruitsクラスのprintFruitsメソッド」を実行すると
        Fruits.printFruits(fruits,count);

    }
}


