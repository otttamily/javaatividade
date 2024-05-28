public class Main {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory("INTERFACE.TXT");

        LoggerFactory.Loggerconsole(Level.DEBUG, "This is a debug message for console");
        LoggerFactory.Loggerconsole(Level.WARNING,  "This is a debug message for console");
        LoggerFactory.Loggerconsole(Level.ERROR, "This is a debug message for console");

        LoggerFactory.Loggerfile(Level.DEBUG,"This is a debug message for console");
        LoggerFactory.Loggerfile(Level.WARNING,"This is a debug message for console");
        LoggerFactory.Loggerfile(Level.ERROR,"This is a debug message for console");
    }
}