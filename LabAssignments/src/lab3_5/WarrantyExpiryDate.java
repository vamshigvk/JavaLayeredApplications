package lab3_5;
import java.util.*;

import java.time.LocalDate;

public class WarrantyExpiryDate {

	public void expiryCalculator(LocalDate purchaseDate, int warrantyMonths, int warrantyYears)
	{
		LocalDate expiryDateInYear= purchaseDate.plusYears(warrantyYears);
		LocalDate expiryDateInYearMonth= expiryDateInYear.plusMonths(warrantyMonths);
		System.out.println("Expiry date with warranty "+warrantyMonths+"months and" + warrantyYears+"years is: "+ expiryDateInYearMonth );
	}
}
