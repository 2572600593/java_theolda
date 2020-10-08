package Demo5;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(25);
//        hero.setWeapon("大宝剑"); 不行,不能直接赋String,需要一个Weapon对象

        Weapon weapon = new Weapon("大宝剑");  // 创建对象
        hero.setWeapon(weapon);  // 将weapon对象传入，成功加入武器

        hero.attack();
    }
}
