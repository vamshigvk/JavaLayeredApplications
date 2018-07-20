Please refer to the word document "Java 8 Features with Scenario", Topic: "Scenario 5:"
as the code here is in support of its concept

Scenario: Reference to a Constructor using method-reference 

Set<Person> rosterSetLambda = transferElements(roster, () -> { return new HashSet<>(); });	
Note: in the code above we send the second argument as a lambda expression, where we explicitly say new HastSet, in a way invoking
the constructor of HastSet

Set<Person> rosterSet = transferElements(roster, HashSet::new);
Note: in the code above we send the second argument as a method-reference, where we are invoking the constructor of HashSet