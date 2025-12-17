package pattern.factory_method.abstract_factory.model.modelImpl.metal;

import pattern.factory_method.abstract_factory.model.Sofa;

public class MetalSofa implements Sofa {
    @Override
    public void useSofa() {
        System.out.println("Metal Sofa неудобно");
    }
}
