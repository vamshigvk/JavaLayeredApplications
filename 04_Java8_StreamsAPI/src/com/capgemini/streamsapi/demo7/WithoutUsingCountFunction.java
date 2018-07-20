package com.capgemini.streamsapi.demo7;

import java.util.Arrays;
import java.util.List;

import com.capgemini.streamsapi.demo4.Book;

public class WithoutUsingCountFunction {
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
		
		double bookCountOfGenreTechnology1 = 0;
		
		double bookCountOfGenreTechnology2 = 0;
		
		for (int index = 0; index < books.size(); index++) {
			
			Book book = books.get(index);
			
			if( book.getGenre().equalsIgnoreCase("technology"))
			{
				bookCountOfGenreTechnology1++;
			}
		}
		
		for (int index = 0; index < books.size(); index++) {
			
			Book book = books.get(index);
			
			if( book.getGenre().equalsIgnoreCase("technology") && book.getPrice() > 3000)
			{
				bookCountOfGenreTechnology2++;
			}
		}
		
		System.out.println("Book Count of Genre Technology: " + bookCountOfGenreTechnology1);
		System.out.println("Of Which number of books which are priced above 3000 is: " + bookCountOfGenreTechnology2);
	}
}
