package creature;

public interface Builder {
    void reset();
    void setNumberOfLegs(int numberOfLegs);
    void setWeight(int weight);
    void setIsCarnivore(boolean isCarnivore);
}
