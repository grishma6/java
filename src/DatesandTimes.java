import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesandTimes{
    public static void main(String[] args){
        //How to work on DATES&TIMES using java
        //(LocalDate, LocalTime, LocalDateTime, UTC TimeStamp)
        //isEqual, isAfter, isBefore


        //CURRENT DATE
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //LOCAL TIME
        LocalTime time = LocalTime.now();
        System.out.println(time);

        //LOCATE DATE TIME
        //LocalDateTime dateTime = LocalDateTime.now();
        //System.out.println(dateTime);

        //UTC(military time)
        Instant instant = Instant.now();
        System.out.println(instant);

        //CUSTOM FORMAT
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(newDateTime);

        //PARTICULAR DATE
        LocalDate date3 = LocalDate.of(2025,12,25);
        System.out.println(date3);


        //PARTICULAR TIME
        LocalDateTime date1 = LocalDateTime.of(2025,12,15,12,23,10);
        LocalDateTime date2 = LocalDateTime.of(2025,8,15,12,0,0);
        if(date1.isBefore(date2)){
            System.out.println(date1 + " is before " + date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date2 + " is before " + date1);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + "is equivalent to " + date2);
        }

    }
}
