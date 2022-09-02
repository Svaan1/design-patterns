public class ImplAnimalBuilder implements Builder {
    private Animal animal;

    ImplAnimalBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.animal = new Animal();
    }

    @Override
    public void setNumberOfLegs(int numberOfLegs) {
        this.animal.numberOfLegs = numberOfLegs;
    }

    @Override
    public void setWeight(int weight) {
        this.animal.weight = weight;
    }

    @Override
    public void setIsCarnivore(boolean isCarnivore) {
        this.animal.isCarnivore = isCarnivore;
    }

    public Animal build(){
        Animal animal = this.animal;
        this.reset();
        return animal;
    }
}
