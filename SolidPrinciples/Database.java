//D - Dependency Inversion Principle
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class Application {
    private Database database;

    // Injecting abstraction (constructor injection)
    public Application(Database database) {
        this.database = database;
    }

    void start() {
        database.connect();
    }
}
