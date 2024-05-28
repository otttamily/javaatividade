import java.time.LocalDateTime;

public class LoggerConsole implements Logger{

    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String RED = "\033[0;31m";
    public static final String RESET = "\033[0m";

    @Override
    public void log(Level level, String message) {
        String hora = LocalDateTime.now().toString();
        String color;

        if (level == Level.DEBUG){
            color = GREEN;
        } else if (level == Level.WARNING){
            color = YELLOW;
        } else if (level == Level.ERROR){
            color = RED;
        } else {
            color = RESET;
        }

        System.out.println(color+hora+level+message+RESET);

    }
}
