abstract class Vehicle {
    private final String name;
    private final String color;
    private final boolean engine;
    private final int weight;
    private final int numberOfSeats;

    public String getName() {
        return name;
    }

    public Vehicle(String name, String color, boolean engine, int weight, int numberOfSeats ) {
        this.name = name;
        this.color = color;
        this.engine = engine;
        this.weight = weight;
        this.numberOfSeats = numberOfSeats;
    }
    // A prototype constructor, basically constructs a new Vehicle based on another Vehicle instance
    protected Vehicle(Vehicle source) {
        this.name = source.name;
        this.color = source.color;
        this.engine = source.engine;
        this.weight = source.weight;
        this.numberOfSeats = source.numberOfSeats;
    }

    public abstract Vehicle clone();
}
