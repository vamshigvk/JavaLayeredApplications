Please refer to the word document "Java 8 Features with Scenario", Topic: "Scenario 4:"
as the code here is in support of its concept

Scenario: Sorting using Lambda Expression call the "instance method" of the ComparisonProvider class

Note in the demo2, we had passed lambda expression as an input for the second argument of the method Collections.sort

First we create instance of the class

	ComparisonProvider comparisonProvider = new ComparisonProvider();

Then using the object refer to the instance methods
		
	Collections.sort(roster, comparisonProvider::compareByAge);
	Collections.sort(roster, comparisonProvider::compareByName);