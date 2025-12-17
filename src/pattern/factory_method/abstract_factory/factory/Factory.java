package pattern.factory_method.abstract_factory.factory;

import pattern.factory_method.abstract_factory.model.Chair;
import pattern.factory_method.abstract_factory.model.Sofa;
import pattern.factory_method.abstract_factory.model.Table;

public interface Factory {
    Chair getChair();
    Table getTable();
    Sofa getSofa();
}
