package pattern.factory_method.abstract_factory.model.modelImpl.plastic;

import pattern.factory_method.abstract_factory.model.Table;

public class PlasticTable implements Table {
    @Override
    public void useTable() {
        System.out.println("Used PlasticTable: легкий");
    }
}
