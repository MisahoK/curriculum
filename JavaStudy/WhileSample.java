
import java.util.Scanner; 

public class WhileSample { 
  public static void main(String[] args) { 
    int inputNum; // ユーザ入力値 
    int sum = 0; // 合計値 

    // ユーザ入力読み込みオブジェクトを生成 
    Scanner scanner = new Scanner(System.in); 

    // 初回の数値入力 
    System.out.print("数値入力（-1で終了）："); 
    inputNum = scanner.nextInt(); 
    //ユーザーがキーボード入力した数値を変数に格納するための一行

    // ユーザから「-1」が入力されるまで、入力された数値をsum変数に加算 
    // "inputNumが-1ではない"間は、
    while (inputNum != -1) { 
      // 入力値をsumに加算 
      // sum = sum + inputNum inputNumがユーザー入力値か。
      sum += inputNum; 

      // ２回目以降の数値入力 （？なぜ「初回の数値入力」が必要なのか？→変数は必ず初期化）
      System.out.print("数値入力（-1で終了）："); 
      inputNum = scanner.nextInt();  //この一行を無くして実行すると、
    } 

    // 合計値を表示 
    System.out.println("入力された数値の合計は " + sum + " です。"); 
  } 
}