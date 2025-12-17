package pattern.factory_method.factory.factoryImpl;

import pattern.factory_method.factory.Factory;
import pattern.factory_method.model.Chair;
import pattern.factory_method.model.modelImpl.PlasticChair;

public class PlasticFactory implements Factory {
    @Override
    public Chair getChair() {
        return new PlasticChair();
    }
}
