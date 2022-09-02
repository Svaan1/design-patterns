public class Director {
    private Builder builder;

    void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void createPigAnimal(Builder builder) {
        builder.reset();
        builder.setIsCarnivore(false);
        builder.setWeight(100);
        builder.setNumberOfLegs(4);
    }

    public void createWolfPuppy(Builder builder) {
        builder.reset();
        builder.setIsCarnivore(true);
        builder.setWeight(20);
        builder.setNumberOfLegs(4);
    }
}
