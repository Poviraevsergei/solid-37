package pattern.factory_method.factory.factoryImpl;

import pattern.factory_method.factory.Factory;
import pattern.factory_method.model.Chair;
import pattern.factory_method.model.modelImpl.MetalChair;

public class MetalFactory implements Factory {
    @Override
    public Chair getChair() {
        return new MetalChair();
    }
}
