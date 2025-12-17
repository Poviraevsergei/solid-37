package pattern.factory_method.abstract_factory.model.modelImpl.wood;

import pattern.factory_method.abstract_factory.model.Table;

public class WoodTable implements Table {
    @Override
    public void useTable() {
        System.out.println("Wood Table: аутентичный");
    }
}
