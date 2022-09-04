import java.util.Optional;

public class Application {


    public static void main(String[] args) {
        Optional<Shape> triangle = ShapeFactory.createShape(3);
        Optional<Shape> square = ShapeFactory.createShape(4);
        Optional<Shape> pentagon = ShapeFactory.createShape(5);
        Optional<Shape> nonExistent =  ShapeFactory.createShape(1);

        System.out.println(triangle.get().getName());
        System.out.println(square.get().getName());
        System.out.println(pentagon.get().getName());
        System.out.println(nonExistent.isPresent());
    }

}
