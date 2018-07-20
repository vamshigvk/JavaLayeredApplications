package lab3_4;

import java.time.LocalDate;
import java.time.Month;

public class TestDateBetweenDuration {

	public static void main(String[] args) {
		
	
	DateBetweenDuration db=new  DateBetweenDuration();
	
	LocalDate end=LocalDate.of(2019, Month.JANUARY , 29);
	LocalDate start= LocalDate.of(2018, Month.MARCH,29);
	db.findDifference(end,start);
	
	
	}
	
}
