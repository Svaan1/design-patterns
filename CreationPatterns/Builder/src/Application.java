import creature.Director;
import creature.implementation.Animal;
import creature.implementation.AnimalBuilder;
import creature.implementation.PuppyBuilder;
import creature.implementation.Puppy;

class Main {
    public static void main(String[] args) {
        Director creatureDirector = new Director();

        AnimalBuilder animalBuilder = new AnimalBuilder();
        creatureDirector.createPigAnimal(animalBuilder);
        Animal pig = animalBuilder.build();

        PuppyBuilder puppyBuilder = new PuppyBuilder();
        creatureDirector.createWolfPuppy(puppyBuilder);
        Puppy wolf = puppyBuilder.build();

    }
}
