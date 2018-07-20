package com.synergetics.methodref.demo1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Person {
	
	   public enum Sex {
	        MALE, FEMALE
	    }

	    String name;
	    LocalDate birthday;
	    Sex gender;
	    String emailAddress;
		
	    public Person() {
			super();
		}

		public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
			super();
			this.name = name;
			this.birthday = birthday;
			this.gender = gender;
			this.emailAddress = emailAddress;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public LocalDate getBirthday() {
			return birthday;
		}

		public void setBirthday(LocalDate birthday) {
			this.birthday = birthday;
		}

		public Sex getGender() {
			return gender;
		}

		public void setGender(Sex gender) {
			this.gender = gender;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		@Override
		public String toString() 
		{
			return "Person [name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", emailAddress="
					+ emailAddress + "]";
		}
		
		public static List<Person> createRoster(){
			
			List<Person> roster = Arrays.asList(
						new Person("Eric", LocalDate.parse("21/04/1992", DateTimeFormatter.ofPattern("d/MM/yyyy")), Sex.MALE, "eric@gmail.com"),
						new Person("Peter", LocalDate.parse("15/01/1991", DateTimeFormatter.ofPattern("d/MM/yyyy")), Sex.MALE, "peter@hotmail.com"),
						new Person("John", LocalDate.parse("05/01/1995", DateTimeFormatter.ofPattern("d/MM/yyyy")), Sex.MALE, "john@outlook.com"),
						new Person("Monica", LocalDate.parse("12/02/1998", DateTimeFormatter.ofPattern("d/MM/yyyy")), Sex.FEMALE, "monica@yahoo.co.uk"),
						new Person("Alba", LocalDate.parse("12/12/1989", DateTimeFormatter.ofPattern("d/MM/yyyy")), Sex.FEMALE, "alba@albastores.com"),
						new Person("Janet", LocalDate.parse("16/07/1999", DateTimeFormatter.ofPattern("d/MM/yyyy")), Sex.FEMALE, "janet@jackson.com")					
					);
			
			
			return roster;					
		}
		
		public void printPerson()
		{
			System.out.println( this.toString() );
		}
		
}
