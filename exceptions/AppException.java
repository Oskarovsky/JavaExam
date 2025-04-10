package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class AppException implements AutoCloseable{

    public static void main(String[] args) throws Exception {
        whatHappensNext();
        LocalDateTime book = LocalDateTime.of(2022, 4, 5, 12, 30, 20);
        System.out.print(book.format(DateTimeFormatter.ofPattern("z")));

    }

    public static void whatHappensNext() throws IOException {
    }

    @Override
    public void close() throws IOException {
        throw new FileNotFoundException("Cage not closed");
    }
}
