package pattern.factory_method;

import pattern.factory_method.factory.Factory;
import pattern.factory_method.factory.factoryImpl.MetalFactory;
import pattern.factory_method.factory.factoryImpl.PlasticFactory;
import pattern.factory_method.factory.factoryImpl.WoodFactory;
import pattern.factory_method.model.Chair;

public class MainFactory {
    public static void main(String[] args) {
        String requestParam = "plastic";

        Factory factory = null;
        if (requestParam.equals("metal")) {
            factory = new MetalFactory();
        } else if (requestParam.equals("wood")) {
            factory = new WoodFactory();
        } else if (requestParam.equals("plastic")) {
            factory = new PlasticFactory();
        } else {
            throw new IllegalArgumentException("Unknown request parameter: " + requestParam);
        }

        Chair chair = factory.getChair();
        chair.useChair();
    }
}
