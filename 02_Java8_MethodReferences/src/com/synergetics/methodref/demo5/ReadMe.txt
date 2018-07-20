Please refer to the word document "Java 8 Features with Scenario", Topic: "Scenario 5:"
as the code here is in support of its concept

Scenario: Referencing an Instance Method of an Arbitrary Object of a Particular Type using method-reference

String[] stringArray = { "Barbara", "James", "Mary", "John",
    "Patricia", "Robert", "Michael", "Linda" };
    
Arrays.sort(stringArray, String::compareToIgnoreCase);

Note: here compareToIgnoreCase is an instance method of the Type String