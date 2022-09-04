public class Singleton {
    private final Database database;

    private static volatile Singleton instance;

    private Singleton(String databaseName) {
        this.database = new Database(databaseName);
    }

    public static Singleton getInstance(String databaseName) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
            } if (result == null) {
                instance = result = new Singleton(databaseName);
            }
        }
        return result;
    }

    public Database getDatabase() {
        return database;
    }

    public void query(String sql) {
        System.out.println("You would use the database instance and run the desired query");
    }
}
