package pattern.factory_method.decorator.skills;

import pattern.factory_method.decorator.Decorator;
import pattern.factory_method.decorator.Developer;

public class TestSkill extends Decorator {
    public TestSkill(Developer developer) {
        super(developer);
    }

    @Override
    public void skill() {
        super.skill();
        System.out.println("I know how to do tests!");
    }
}
