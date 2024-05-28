public class LoggerFactory {
    private static LoggerConsole loggerconsole;
    private static LoggerFile loggerfile;

    public LoggerFactory (String LogFilename) {
        this.loggerconsole = new LoggerConsole();
        this.loggerfile = new LoggerFile(LogFilename);
    }
    public static void Loggerconsole(Level level, String message){
        loggerconsole.log(level, message);
    }
    public static void Loggerfile(Level level, String message){
        loggerfile.log(level, message);
    }
}