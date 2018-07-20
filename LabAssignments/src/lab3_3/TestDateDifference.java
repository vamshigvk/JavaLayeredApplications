package lab3_3;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class TestDateDifference {
public static void main(String[] args) {
	

	DateDifference df= new DateDifference();
	LocalDate end=LocalDate.of(2019, Month.JANUARY , 29);
	
	df.findDifference(end);
}	
	
}
