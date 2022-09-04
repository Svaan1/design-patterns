package furniture.implementation.classic;

import furniture.FurnitureFactory;
import furniture.Chair;
import furniture.Table;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();

    }
    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
