package check;
//ペットを作るためのクラス
public class Pet {
    //属性（ペットの名前と飼い主の名前）
    private String name;
    private String masterName;

    //操作
    //
    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    //それぞれの名前を呼び出すメソッド
    protected String getName() {
        return name;
    }

    protected String getMasterName() {
        return masterName;
    }

    //ペットが自己紹介をするメソッド
    public void introduce() {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}

//petクラスを継承したRobotPetクラス
class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    public void introduce() {
        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }

}
