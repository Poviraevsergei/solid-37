package pattern.factory_method.abstract_factory.model.modelImpl.wood;

import pattern.factory_method.abstract_factory.model.Sofa;

public class WoodSofa implements Sofa {
    @Override
    public void useSofa() {
        System.out.println("Wood Sofa: да");
    }
}
