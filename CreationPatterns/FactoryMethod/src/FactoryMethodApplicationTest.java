class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*100);

        if (randomNumber % 2 == 0) {
            new ImplEvenNumberGenerator().printRandomNumbers(3);
        } else {
            new ImplOddNumberGenerator().printRandomNumbers(3);
        }

    }
}
