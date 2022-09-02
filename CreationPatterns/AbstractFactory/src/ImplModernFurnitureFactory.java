public class ImplModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ImplModernChair();
    }

    @Override
    public Table createTable() {
        return new ImplModernTable();
    }
}
