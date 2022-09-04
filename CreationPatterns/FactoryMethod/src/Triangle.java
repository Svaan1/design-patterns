public class Triangle implements Shape {
    private final int numberOfSides = 3;

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}

