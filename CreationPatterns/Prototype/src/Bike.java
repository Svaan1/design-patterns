public class Bike extends Vehicle {
    private final int tireSize;

    Bike(String name, String color, boolean engine, int weight, int numberOfSeats, int tireSize) {
        super(name, color, engine, weight, numberOfSeats);
        this.tireSize = tireSize;
    }

    Bike(Bike bike) {
        super(bike);
        this.tireSize = bike.tireSize;
    }

    @Override
    public Bike clone() {
        return new Bike(this);
    }
}
