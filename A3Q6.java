import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class A3Q6 {
    public static void main(String args[]){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        DateTimeFormatter dated = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timet = DateTimeFormatter.ofPattern("HH:mm:ss");
        String dater = date.format(dated);
        String timer = time.format(timet);
        System.out.println("Date : "+dater+'\n'+"Time : "+timer);
    }
}
