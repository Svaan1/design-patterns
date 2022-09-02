public class ImplClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ImplClassicChair();

    }

    @Override
    public Table createTable() {
        return new ImplClassicTable();
    }
}
