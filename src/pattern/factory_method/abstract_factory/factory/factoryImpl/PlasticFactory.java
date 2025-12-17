package pattern.factory_method.abstract_factory.factory.factoryImpl;

import pattern.factory_method.abstract_factory.factory.Factory;
import pattern.factory_method.abstract_factory.model.Chair;
import pattern.factory_method.abstract_factory.model.Sofa;
import pattern.factory_method.abstract_factory.model.Table;
import pattern.factory_method.abstract_factory.model.modelImpl.plastic.PlasticChair;
import pattern.factory_method.abstract_factory.model.modelImpl.plastic.PlasticSofa;
import pattern.factory_method.abstract_factory.model.modelImpl.plastic.PlasticTable;

public class PlasticFactory implements Factory {
    @Override
    public Chair getChair() {
        return new PlasticChair();
    }

    @Override
    public Table getTable() {
        return new PlasticTable();
    }

    @Override
    public Sofa getSofa() {
        return new PlasticSofa();
    }
}
