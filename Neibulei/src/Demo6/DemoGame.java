package Demo6;

public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Aix");

        // 使用实现类
//        hero.setSkill(new SkillImpl());

        // 使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("施放技能");
//            }
//        };
//        hero.setSkill(skill);  // 把new的skill放进去

        // 进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("施放技能");
            }
        });

        hero.attact();
    }
}

