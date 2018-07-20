package lab3_3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class DateDifference {
	public void findDifference(LocalDate end)
	{
		LocalDate start= LocalDate.now();
		Period period= start.until(end);
		
		System.out.println("Days :" + period.get(ChronoUnit.DAYS));
		
		System.out.println("Months:"+ period.get(ChronoUnit.MONTHS));
		
		System.out.println("Years:"+ period.get(ChronoUnit.YEARS));
		
		
		
	}
}
