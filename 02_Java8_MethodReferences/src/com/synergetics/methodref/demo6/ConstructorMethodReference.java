package com.synergetics.methodref.demo6;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import com.synergetics.methodref.demo1.Person;

public class ConstructorMethodReference 
{
	public static void main(String args[]) {

		List<Person> roster = Person.createRoster();  
		
		
		//The functional interface Supplier contains one method get that takes no arguments and returns an object. 
		//Consequently, you can invoke the method transferElements with a lambda expression as follows:
		Set<Person> rosterSetLambda = transferElements(roster, () -> { return new HashSet<>(); });		
		
		//The Java compiler infers that you want to create a HashSet collection that contains elements of type Person. 
		Set<Person> rosterSet = transferElements(roster, HashSet::new);
		
		//Alternatively, you can specify this as follows:
		//Set<Person> rosterSet = transferElements(roster, HashSet<Person>::new);
		
		System.out.println( rosterSetLambda );
		System.out.println( rosterSet ); 
	}
	
	public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>  DEST transferElements(
        SOURCE sourceCollection,
        Supplier<DEST> collectionFactory) {
        
        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
}
}
