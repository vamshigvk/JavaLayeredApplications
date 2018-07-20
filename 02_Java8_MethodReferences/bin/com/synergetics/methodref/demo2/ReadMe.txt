Please refer to the word document "Java 8 Features with Scenario", Topic: "Scenario 2:"
as the code here is in support of its concept

Scenario: Sorting using Lambda Expression to pass the functional interface object 

Please note in the previous example the second argument to the collections.sort method which accepts comparator 
was an object of the well defined class "PersonAgeComparator.java". Here we replace this class by using a lambda expression
as the second argument, we are able to do this as the second argument is an ref of comparator which as we are aware is a 
functional interface.

