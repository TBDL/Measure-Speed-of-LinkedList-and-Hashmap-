package com.example.demo;

import java.util.*;
import java.lang.*;
import java.io.*;


public class DemoApplication {

	public static void main(String[] args) {
		LinkedList<Book> booklist = new LinkedList<Book>();

		for(int n = 0; n < 3000000; n++) {

			booklist.add(new Book("author", "title"));

		}

		System.out.println("-------------Part1-------------");

		// Measure time of searching the first object on booklist
		long begin1 = System.nanoTime();
		booklist.get(0);
		long end1 = System.nanoTime();
		System.out.println("The time of searching the first object on LinkedList is: " +
				(end1 - begin1) + " nanoseconds");

		// Measure time of searching the last object on booklist
		long begin2 = System.nanoTime();
		booklist.get(booklist.size()-1);
		long end2 = System.nanoTime();
		System.out.println("The time of searching the last object on LinkedList is: " +
				(end2 - begin2) + " nanoseconds");

		// Measure time of removing the first object from booklist
		long begin3 = System.nanoTime();
		booklist.remove(0);
		long end3 = System.nanoTime();
		System.out.println("The time of removing the first object from LinkedList is: " +
				(end3 - begin3) + " nanoseconds");

		// Measure time of removing the last object from booklist
		long begin4 = System.nanoTime();
		booklist.remove(booklist.size()-1);
		long end4 = System.nanoTime();
		System.out.println("The time of removing the last object from LinkedList is: " +
				(end4 - begin4) + " nanoseconds");


		System.out.println("-------------Part2-------------");

		HashMap<Integer, Book> booklist2 = new HashMap<Integer, Book>();

		for(int n = 0; n < 3000000; n++) {

			Random generator = new Random();
			int randomNumber = generator.nextInt(100);

			Book randomBook = new Book("author", "title");

			booklist2.put(randomNumber, randomBook);
		}

		// Measure time of searching an object on booklist2
		long begin5 = System.nanoTime();
		booklist2.get(1500000);
		long end5 = System.nanoTime();
		System.out.println("The time of searching an object on HashMap is: " +
				(end5 - begin5) + " nanoseconds");

		// Measure time of adding an object to booklist2
		long begin6 = System.nanoTime();
		booklist2.put(1, new Book("author", "title"));
		long end6 = System.nanoTime();
		System.out.println("The time of adding an object to HashMap is: " +
				(end6 - begin6) + " nanoseconds");

		// Measure time of removing an object from booklist2
		long begin7 = System.nanoTime();
		booklist2.remove(1500000);
		long end7 = System.nanoTime();
		System.out.println("The time of removing an object from HashMap is: " +
				(end7 - begin7) + " nanoseconds");
	}
}
