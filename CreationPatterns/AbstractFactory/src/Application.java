import furniture.implementation.classic.ClassicFurnitureFactory;
import furniture.Chair;
import furniture.FurnitureFactory;
import furniture.Table;
import furniture.implementation.modern.ModernFurnitureFactory;

class Main {
    public static void main(String[] args) {
        FurnitureFactory classicFactory = new ClassicFurnitureFactory();
        Chair classicChair = classicFactory.createChair();
        Table classicTable = classicFactory.createTable();

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
    }
}
