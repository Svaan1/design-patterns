public class Application {
    public static void main(String[] args) {
        Vehicle bike = new Bike("Yamaha", "Red", false, 15, 2, 650);
        Vehicle helicopter = new Helicopter("SA315B Lama", "Black", true, 6350, 4, 4);

        Vehicle bikeClone = bike.clone();
        Vehicle helicopterClone = helicopter.clone();

        System.out.println(bike);
        System.out.println(bike.getName());
        System.out.println(bikeClone);
        System.out.println(bikeClone.getName());

        System.out.println(helicopter);
        System.out.println(helicopter.getName());
        System.out.println(helicopterClone);
        System.out.println(helicopterClone.getName());
    }
}
