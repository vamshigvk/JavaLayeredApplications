package lab3_4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class DateBetweenDuration {
	public void findDifference(LocalDate start, LocalDate end)
	{
		
		Period period= start.until(end);
		
		System.out.println("Days :" + period.get(ChronoUnit.DAYS));
		
		System.out.println("Months:"+ period.get(ChronoUnit.MONTHS));
		
		System.out.println("Years:"+ period.get(ChronoUnit.YEARS));
		
		
		
	}
}
