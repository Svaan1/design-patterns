public class Square implements Shape{
    private final int numberOfSides = 4;

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public String getName() {
        return "Square";
    }
}
