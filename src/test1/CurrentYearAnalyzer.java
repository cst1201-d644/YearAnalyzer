package test1;

import java.time.LocalDate;

/**
 * Outputs certain statistics about the current year.
 */
public class CurrentYearAnalyzer {

	public static void main(String[] args) {
		//get the current year.
		int year = LocalDate.now().getYear();

		System.out.print("The current year " + year + " is ");

		if (year % 2 == 0) //it's even.
			System.out.println("even.");
		else //it's odd.
			System.out.println("odd.");
	}
}
