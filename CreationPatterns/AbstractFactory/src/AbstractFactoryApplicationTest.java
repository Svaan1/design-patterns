class Main {
    public static void main(String[] args) {
        FurnitureFactory classicFactory = new ImplClassicFurnitureFactory();
        Chair classicChair = classicFactory.createChair();
        Table classicTable = classicFactory.createTable();

        FurnitureFactory modernFactory = new ImplModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
    }
}
