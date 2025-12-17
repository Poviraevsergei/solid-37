package pattern.factory_method.abstract_factory;

import pattern.factory_method.abstract_factory.factory.Factory;
import pattern.factory_method.abstract_factory.factory.factoryImpl.MetalFactory;
import pattern.factory_method.abstract_factory.factory.factoryImpl.PlasticFactory;
import pattern.factory_method.abstract_factory.factory.factoryImpl.WoodFactory;
import pattern.factory_method.abstract_factory.model.Chair;
import pattern.factory_method.abstract_factory.model.Sofa;
import pattern.factory_method.abstract_factory.model.Table;

public class MainFactory {
    public static void main(String[] args) {
        String requestParam = "wood";

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

        Table table = factory.getTable();
        table.useTable();

        Sofa sofa = factory.getSofa();
        sofa.useSofa();
    }
}
