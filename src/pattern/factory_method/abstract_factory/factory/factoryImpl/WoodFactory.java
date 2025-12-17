package pattern.factory_method.abstract_factory.factory.factoryImpl;

import pattern.factory_method.abstract_factory.factory.Factory;
import pattern.factory_method.abstract_factory.model.Chair;
import pattern.factory_method.abstract_factory.model.Sofa;
import pattern.factory_method.abstract_factory.model.Table;
import pattern.factory_method.abstract_factory.model.modelImpl.wood.WoodChair;
import pattern.factory_method.abstract_factory.model.modelImpl.wood.WoodSofa;
import pattern.factory_method.abstract_factory.model.modelImpl.wood.WoodTable;

public class WoodFactory implements Factory {
    @Override
    public Chair getChair() {
        return new WoodChair();
    }

    @Override
    public Table getTable() {
        return new WoodTable();
    }

    @Override
    public Sofa getSofa() {
        return new WoodSofa();
    }
}
