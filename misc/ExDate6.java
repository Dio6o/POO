package misc;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExDate6 {
    public static void main(String[] args) {
        DateTimeFormatter dtfDataBraail = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime date = LocalDateTime.parse("24/04/1978 15:01:27", dtfDataBraail);
        System.out.println(date);
    }
}