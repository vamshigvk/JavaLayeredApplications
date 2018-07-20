Please refer to the word document "Java 8 Features with Scenario", Topic: "Scenario 3:"
as the code here is in support of its concept

Scenario: Sorting using Lambda Expression call to the static method of the Person class (lambda calling method) 

Note in the demo2, we had passed lambda expression as an input for the second argument of the method Collections.sort

In the lambda expression we had provided the logic of comparison. However in this demo i.e. demo 3 we have a method static method
compareByAge in the Person class. So we modify the lambda expression which was used as the second argument to the method
Collections.sort and make the lambda expression point to the method  compareByAge using method reference

Class::static method

so our code becomes

Collections.sort(roster, Person::compareByAge);
