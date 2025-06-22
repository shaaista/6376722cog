public class Logger {
    private static final Logger instance = new Logger();

    private Logger() {
        System.out.println("Logger initialized");
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String msg) {
        System.out.println("Log: " + msg);
    }
}
