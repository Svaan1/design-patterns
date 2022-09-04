public class Application {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance("Test 1"));
        Singleton singleton = Singleton.getInstance("Test 2");
        System.out.println(singleton);
        System.out.println(singleton.getDatabase());
    }
}
