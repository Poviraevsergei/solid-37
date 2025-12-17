package pattern.factory_method.abstract_factory.model.modelImpl.metal;

import pattern.factory_method.abstract_factory.model.Chair;

public class MetalChair implements Chair {
    @Override
    public void useChair() {
        System.out.println("Metal chair. Good choose! ");
    }
}
