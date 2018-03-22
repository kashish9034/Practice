package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

import strings.OF;

public class DateImpl {
	
	public static void main(String[] args) {
	
			period();
	}
	
	public static void DTF(){
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(LocalDateTime.now().format(dtf));
		
		
	}
	public static void period() {
		OF.insertLine();
		Period ashortperiod = Period.parse("p5y10m89d");
		OF.print("a period of 5 years and 2 months", ashortperiod);
		OF.print("7 years from now day will be", LocalDateTime.now().plus(Period.parse("p7y")));
		OF.print("period between Dob and now", Period.between(LocalDate.of(1994, 11, 06), LocalDate.now()));
	}

	public static void Date() {
		// Creating three local dates with three instantiation methods.
		OF.insertLine();
		LocalDate birth = LocalDate.of(1994, 11, 06);
		LocalDate specialday = LocalDate.from(birth);
		LocalDate marriage = LocalDate.parse("2017-11-12");
		
		System.out.println(birth.plusYears(23));
		System.out.println(birth.plusMonths(3));
		System.out.println(marriage.isBefore(LocalDate.now()));

		// printing methods with return type String
		System.out.println(birth.getDayOfWeek());
		System.out.println(birth.getMonth());

		// printing all integer info about date
		System.out.println(birth.getDayOfMonth());
		System.out.println(birth.getDayOfYear());

		// printing special day

		System.out.println(specialday);

		// to epoch date
		System.out.println(birth.toEpochDay());

		// converting to date time

		LocalDateTime birthtime = birth.atTime(11, 30, 30);
		System.out.println(birthtime);

	}

	public static void time() {
		OF.insertLine();

		LocalTime auspicious_time = LocalTime.of(22, 10, 40, 1110);
		OF.print("Initializing time with", auspicious_time);
		OF.print("the time now is ", LocalTime.now());
		OF.print("auspicious_time.isAfter(LocalTime.now)", auspicious_time.isAfter(LocalTime.now()));
		OF.insertLine();
	}

}
