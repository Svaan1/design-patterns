
public class ImplOddNumberGenerator extends NumberGenerator {
    @Override
    int generateRandomNumber() {
        int randomOddNumber = (int) (Math.random()*100);
        randomOddNumber += (randomOddNumber % 2 == 0 ? 1 : 0);

        return randomOddNumber;
    }
}
