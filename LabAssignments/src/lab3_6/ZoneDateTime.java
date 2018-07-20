package lab3_6;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTime {

	
	public void printDateTime(String s)
	{
	
		ZonedDateTime currentTime= ZonedDateTime.now();
		ZonedDateTime zone= ZonedDateTime.now(ZoneId.of(s));
		System.out.println("Area:"+ s +" : " + zone );
		
	}
}
