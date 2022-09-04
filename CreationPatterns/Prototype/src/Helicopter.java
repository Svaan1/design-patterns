public class Helicopter extends Vehicle {
    private final int numberOfPropellers;

    Helicopter(String name, String color, boolean engine, int weight, int numberOfSeats, int numberOfPropellers) {
        super(name, color, engine, weight, numberOfSeats);
        this.numberOfPropellers = numberOfPropellers;
    }

    Helicopter(Helicopter helicopter) {
        super(helicopter);
        this.numberOfPropellers = helicopter.numberOfPropellers;
    }

    @Override
    public Helicopter clone() {
        return new Helicopter(this);
    }
}
