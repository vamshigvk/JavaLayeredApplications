package com.capgemini.streamsapi.demo4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class SortByGenre implements Comparator<Book>
{
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getGenre().compareTo(o2.getGenre());
	}
}

class SortByName implements Comparator<Book>
{
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class WithoutUsingSortFunction {
	public static void main(String[] args) {
		
		List<Book> books = Arrays.asList(
				new Book(1232, "Java", "Technology", 3434),
				new Book(3454, ".NET", "Technology", 8374),
				new Book(5655, "Meditation", "Health", 4333),
				new Book(3893, "BeingOnTop", "Self Motivation", 3924),
				new Book(9333, "Midnight Express", "Thriler", 3429),
				new Book(3934, "PHP", "Technology", 2391),
				new Book(2383, "Oracle", "Technology", 2393),
				new Book(9293, "SpiritualEnlightenment", "Self Motivation", 2389),
				new Book(9824, "JavaScript", "Technology", 2393),
				new Book(9343, "Spring", "Technology", 3933));
		
		Set<Book> booksByName = new TreeSet<Book>( new SortByName() );
		
		for (int index = 0; index < books.size(); index++) {
			booksByName.add( books.get(index) );
		}
		
		Set<Book> booksByGenre = new TreeSet<Book>( new SortByGenre() );
		
		Iterator<Book> it = booksByName.iterator();
		
		while(it.hasNext())
		{
			Book book = it.next();
			
			booksByGenre.add(book);
		}
		
		
		
		it = booksByGenre.iterator();
		
		while(it.hasNext())
		{
			Book book = it.next();
			
			System.out.println( book );
		}
	}
}














