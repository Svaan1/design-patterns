public class Pentagon implements Shape {
    private final int numberOfSides = 5;

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public String getName() {
        return "Pentagon";
    }
}
