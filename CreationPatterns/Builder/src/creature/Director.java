package creature;

public class Director {
    private Builder creatureBuilder;

    void setBuilder(Builder creatureBuilder){
        this.creatureBuilder = creatureBuilder;
    }

    public void createPigAnimal(Builder creatureBuilder) {
        creatureBuilder.reset();
        creatureBuilder.setIsCarnivore(false);
        creatureBuilder.setWeight(100);
        creatureBuilder.setNumberOfLegs(4);
    }

    public void createWolfPuppy(Builder creatureBuilder) {
        creatureBuilder.reset();
        creatureBuilder.setIsCarnivore(true);
        creatureBuilder.setWeight(20);
        creatureBuilder.setNumberOfLegs(4);
    }
}
