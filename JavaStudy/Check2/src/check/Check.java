package check;

//定数クラスの全メンバをインポート
import static constants.Constants.*;

//Main（）のクラス
//課題①【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
//firstName →自分の名字 lastName →自分の名前で初期化(修飾子private)

public class Check {
    private static String firstName = "川上";
    private static String lastName = "美佐穂";

    //課題②firstNameとlastNameを引数で受け取って連結して表示させるメソッド「printName」を作成
    //修飾子private
    private static void printName() {
        System.out.println("printNameメソッド→" + firstName + lastName);
    }
    //?もうどっちの変数もクラスブロック外で初期化してるからメインの方で引き渡さんでもよくね

    public static void main(String[]args) {
        //printNameメソッドの呼び出し
        printName();


        //課題③PetクラスとRobotPetクラスをインスタンス化
        //引数には定数クラスからインポートした値を用いる

        Pet pet = new Pet(CHECK_CLASS_JAVA, CHECK_CLASS_HOGE);
        RobotPet rpet = new RobotPet(CHECK_CLASS_R2D2, CHECK_CLASS_LUKE);

        //Petクラスのintroduceメソッドを呼び出す
        //RobotPetクラスのintroduceメソッドを呼び出す
        pet.introduce();
        rpet.introduce();


    }

}
