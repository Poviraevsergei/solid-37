package pattern.factory_method.abstract_factory.model.modelImpl.plastic;

import pattern.factory_method.abstract_factory.model.Chair;

public class PlasticChair implements Chair {
    @Override
    public void useChair() {
        System.out.println("I'm a PlasticChair");
    }
}
