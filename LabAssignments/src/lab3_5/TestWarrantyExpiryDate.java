package lab3_5;

import java.time.LocalDate;
import java.time.Month;

public class TestWarrantyExpiryDate {
public static void main(String[] args) {
	
	WarrantyExpiryDate wd= new WarrantyExpiryDate();
	LocalDate purchaseDate = LocalDate.of(2017, Month.APRIL, 24);
	
	int warrantyMonths = 6;
	int warrantyYears=2;
	wd.expiryCalculator(purchaseDate, warrantyMonths, warrantyYears);
}
}
