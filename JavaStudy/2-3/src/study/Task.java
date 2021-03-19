package study;
//① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {
    //  protected int plus(int a) {
    //return a + 1;
//}

    //protected int plus(int a, int b) {
    //return a + b;
//}

    //protected int plus(int a, int b, int c) {
    //return a + b + c;
//}
    //がある扱いになった
    //追加なし

    /**
     * タスクの実行
     */
    public void doTask() {
        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。←？
        //superをつけるってこと？

        System.out.println("plusメソッドの値が一つの場合:" + super.plus(10));

        System.out.println("plusメソッドの値が二つの場合:" + super.plus(10, 20));

        System.out.println("plusメソッドの値が三つの場合:" + super.plus(10, 20, 30));

    }

}
