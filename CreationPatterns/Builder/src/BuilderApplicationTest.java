class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ImplAnimalBuilder animalBuilder = new ImplAnimalBuilder();
        director.createPigAnimal(animalBuilder);
        Animal pig = animalBuilder.build();

        ImplPuppyBuilder puppyBuilder = new ImplPuppyBuilder();
        director.createWolfPuppy(puppyBuilder);
        Puppy wolf = puppyBuilder.build();

    }
}
