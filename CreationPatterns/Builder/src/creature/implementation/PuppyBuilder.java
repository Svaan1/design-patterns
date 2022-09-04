package creature.implementation;

import creature.Builder;

public class PuppyBuilder implements Builder {
    private Puppy puppy;

    public PuppyBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.puppy = new Puppy();
    }

    @Override
    public void setNumberOfLegs(int numberOfLegs) {
        this.puppy.numberOfLegs = numberOfLegs;
    }

    @Override
    public void setWeight(int weight) {
        this.puppy.weight = weight;
    }

    @Override
    public void setIsCarnivore(boolean isCarnivore) {
        this.puppy.isCarnivore = isCarnivore;
    }
    public Puppy build() {
        Puppy puppy = this.puppy;
        this.reset();
        return puppy;
    }
}
