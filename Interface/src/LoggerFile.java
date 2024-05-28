import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile implements Logger {
    private final String filename;
    private final DateTimeFormatter formato;

    public LoggerFile(String filename) {
        this.filename = filename;
        formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public void log(Level level, String message) {
        LocalDateTime dateTime = LocalDateTime.now();
        String DateTimeFormatada = dateTime.format(formato);

        String print = String.format("[%s][%s]%s\n", DateTimeFormatada, level.toString(), message);
        try {
            Files.write(Paths.get(filename),
                    print.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IIOException e) {
            System.out.println("Erro ao salvar o arquivo");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}