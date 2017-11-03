package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.test.Unit1ExerciseSoluction7.Condition;

public class Unit1ExerciseSolution8 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("hari","reddy",30),
				new Person("ravi","kumar",30),
				new Person("raju","babu",30)
				);
		
		// sort list by last name
		
		Collections.sort(persons, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// print all methods in the list
		
		printConditionally(persons,p->true);
		
		
		//prints all with lastname start with k
		printConditionally(persons,p -> p.getLastName().startsWith("k"));
		
		printConditionally(persons,p->p.getFirstName().startsWith("h"));
	}

	private static void printAll(List<Person> persons)
	{
		for(Person p : persons)
		{
			System.out.println(p);
		}
	}
	private static void printConditionally(List<Person> persons,Predicate<Person> condition)
	{
		for(Person p : persons)
		{
			if(condition.test(p))
			{
				System.out.println(p);
			}
		}
	}

	interface Condition
	{
		public boolean test(Person p);
	}
}
