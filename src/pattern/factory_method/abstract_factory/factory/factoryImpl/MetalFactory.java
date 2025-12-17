package pattern.factory_method.abstract_factory.factory.factoryImpl;

import pattern.factory_method.abstract_factory.factory.Factory;
import pattern.factory_method.abstract_factory.model.Chair;
import pattern.factory_method.abstract_factory.model.Sofa;
import pattern.factory_method.abstract_factory.model.Table;
import pattern.factory_method.abstract_factory.model.modelImpl.metal.MetalChair;
import pattern.factory_method.abstract_factory.model.modelImpl.metal.MetalSofa;
import pattern.factory_method.abstract_factory.model.modelImpl.metal.MetalTable;

public class MetalFactory implements Factory {
    @Override
    public Chair getChair() {
        return new MetalChair();
    }

    @Override
    public Table getTable() {
        return new MetalTable();
    }

    @Override
    public Sofa getSofa() {
        return new MetalSofa();
    }
}
