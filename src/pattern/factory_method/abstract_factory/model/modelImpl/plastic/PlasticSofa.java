package pattern.factory_method.abstract_factory.model.modelImpl.plastic;

import pattern.factory_method.abstract_factory.model.Sofa;

public class PlasticSofa implements Sofa {
    @Override
    public void useSofa() {
        System.out.println("Using Plastic ненадежный");
    }
}
