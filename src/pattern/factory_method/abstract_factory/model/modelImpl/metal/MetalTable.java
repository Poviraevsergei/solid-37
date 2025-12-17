package pattern.factory_method.abstract_factory.model.modelImpl.metal;

import pattern.factory_method.abstract_factory.model.Table;

public class MetalTable implements Table {
    @Override
    public void useTable() {
        System.out.println("MetalTable: качественный");
    }
}
