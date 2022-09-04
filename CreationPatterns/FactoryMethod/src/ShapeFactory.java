import java.util.Optional;

public class ShapeFactory {
    public static Optional<Shape> createShape(int numberOfSides) {
        switch (numberOfSides) {
            case 3:
                return Optional.of(new Triangle());
            case 4:
                return Optional.of(new Square());
            case 5:
                return Optional.of(new Pentagon());
            default:
                return Optional.empty();
        }
    }
}
