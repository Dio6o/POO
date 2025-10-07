package misc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExDate5 {
    public static void main(String[] args) {
        DateTimeFormatter dtfDataBraail = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse("24/04/1978", dtfDataBraail);
        System.out.println(date);
        System.out.println(date.format(dtfDataBraail));
    }
}