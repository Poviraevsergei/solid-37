package pattern.factory_method.model.modelImpl;

import pattern.factory_method.model.Chair;

public class MetalChair implements Chair {
    @Override
    public void useChair() {
        System.out.println("Metal chair. Good choose! ");
    }
}
