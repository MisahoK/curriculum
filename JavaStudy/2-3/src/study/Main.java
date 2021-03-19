package study;

public class Main {
    public static void main(String[] args) {

        // ③ Taskクラスのインスタンスを生成し、「doTask()」メソッドを呼び出しなさい。
        //Taskクラスをもとに実物を作る→実物に命令をして動かす.Task型にいれる

        Task task = new Task();

        //値の代入は他のクラスでやってるということ？(本当ならここでtaskにいろいろ代入)
        //Taskクラスで既に引数の数を合わせて代入しているので、ここでは（）だけでいい？
        task.doTask();

    }


}
