package pattern.factory_method.factory.factoryImpl;

import pattern.factory_method.factory.Factory;
import pattern.factory_method.model.Chair;
import pattern.factory_method.model.modelImpl.WoodChair;

public class WoodFactory implements Factory {
    @Override
    public Chair getChair() {
        return new WoodChair();
    }
}
