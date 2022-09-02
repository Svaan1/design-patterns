public abstract class NumberGenerator {
    abstract int generateRandomNumber();
    void printRandomNumbers(int times) {
        for (int index = 0; index < times; index++) {
            System.out.println(generateRandomNumber());
        }
    }
}
