import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
class TimeEx{
    public static void main(String args[]){
        LocalDate date=LocalDate.now();
        System.out.println(date);
        Month month=date.getMonth();
        System.out.println(date+""+month);
        System.out.println(date.lengthOfMonth());
        LocalDate bDay=LocalDate.of(Integer.parseInt(Year.now().toString()), Month.JULY, 19);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt.format(dtf));
        if(bDay.isAfter(date))
        System.out.println("Comming soon! "+bDay.compareTo(date));


        LocalDate ld3=ld2.withMonth(2);
        System.out.println(ld3);
 
        LocalDate ld4=ld3.with(ChronoField.DAY_OF_MONTH,9);
        System.out.println(ld4);
 
        System.out.println(ld3.get(ChronoField.DAY_OF_MONTH));
 
        Period p=Period.ofDays(10);
        System.out.println(p.addTo(ldt));
 
        LocalTime lt1=LocalTime.now();
        LocalTime lt2=lt1.plusHours(5);
 
       
        System.out.println(d.toHours());
    }
}