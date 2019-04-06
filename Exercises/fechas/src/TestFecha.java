import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class TestFecha {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        
        String formatoIso = hoy.format(DateTimeFormatter.ISO_DATE);
        String formatoIso2 = hoy.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String formatoIso3 = hoy.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        
        LocalDateTime fecha = LocalDateTime.now();
        System.out.println(fecha);
        
        String formatFecha;
        formatFecha = fecha.format(DateTimeFormatter.ISO_DATE);
        System.out.println(formatFecha);
        //System.out.println(formatoIso);
        //System.out.println(formatoIso2);
        //System.out.println(formatoIso3);
        
        
    }
}
