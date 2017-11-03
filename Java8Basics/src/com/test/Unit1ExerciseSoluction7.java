package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSoluction7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = Arrays.asList(
				new Person("hari","reddy",30),
				new Person("ravi","kumar",30),
				new Person("raju","babu",30)
				);
		
		// sort list by last name
		
		Collections.sort(persons, new Comparator<Person>(){
			
			public int compare(Person p, Person p2)
			{
				return p.getLastName().compareTo(p2.getLastName());
			}
		});
		
		// print all methods in the list
		
		printAll(persons);
		
		
		//prints all with lastname start with k
		printConditionally(persons,new Condition()
		{

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("k");
			}
			
		});
		
		printConditionally(persons,new Condition()
		{

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("h");
			}
			
		});
	}

	private static void printAll(List<Person> persons)
	{
		for(Person p : persons)
		{
			System.out.println(p);
		}
	}
	private static void printConditionally(List<Person> persons,Condition condition)
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
