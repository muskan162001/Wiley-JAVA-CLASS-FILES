//package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {
    
    public static void main(String[] args){
        LocalDate myDate = LocalDate.now();
        //System.out.println(myDate);
    
        LocalTime myTime = LocalTime.now();
        //System.out.println(myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        //System.out.println("Before Format " + myDateTime);

        DateTimeFormatter modDateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        String modiDateTime = myDateTime.format(modDateTime);
        //System.out.println("After Format " + modiDateTime);

        DateTimeFormatter output1 = DateTimeFormatter.ofPattern("yyyy-MM--dd");
        DateTimeFormatter output2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter output3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter output4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

        String modiDateTime1 = myDateTime.format(output1);
        String modiDateTime2 = myDateTime.format(output2);
        String modiDateTime3 = myDateTime.format(output3);
        String modiDateTime4 = myDateTime.format(output4);

        System.out.println("Format 1 yyyy-MM-dd " + modiDateTime1);
        System.out.println("Format 2 dd/MM/yyyy " + modiDateTime2);
        System.out.println("Format 3 dd-MMM-yyyy " + modiDateTime3);
        System.out.println("Format 4 E, MMM dd yyyy " + modiDateTime4);

        String dateStr = "16/11/2001";
        LocalDate date = LocalDate.parse(dateStr, format);
        System.out.println(date);







    }
}
