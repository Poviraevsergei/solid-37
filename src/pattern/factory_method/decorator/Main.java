package pattern.factory_method.decorator;

import pattern.factory_method.decorator.skills.HibernateSkill;
import pattern.factory_method.decorator.skills.SpringSkill;
import pattern.factory_method.decorator.skills.TestSkill;

public class Main {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        developer = new TestSkill(developer);
        developer = new SpringSkill(developer);
        developer = new HibernateSkill(developer);






















        developer.skill();
    }
}
