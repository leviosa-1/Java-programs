import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class prog_140 {
    public static void main(String[] args) {
        String inputDate = "03 04 23";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yy");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        String outputDate = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH));
        System.out.println(outputDate);
    }
}
