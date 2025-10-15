import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
public class DateFormat{
	public static void main(String[] args){
		LocalDate today=LocalDate.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println("today format"+today.format(df));
		LocalDate firstDay=today.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month:"+firstDay.format(df));
	}
}
