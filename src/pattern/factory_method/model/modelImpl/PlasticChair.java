package pattern.factory_method.model.modelImpl;

import pattern.factory_method.model.Chair;

public class PlasticChair implements Chair {
    @Override
    public void useChair() {
        System.out.println("I'm a PlasticChair");
    }
}
