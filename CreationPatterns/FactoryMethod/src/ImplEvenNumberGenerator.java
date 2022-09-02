public class ImplEvenNumberGenerator extends NumberGenerator {
    @Override
    int generateRandomNumber() {
        int randomEvenNumber = (int) (Math.random()*100);
        randomEvenNumber += (randomEvenNumber % 2 == 0 ? 0 : 1);

        return randomEvenNumber;
    }
}
