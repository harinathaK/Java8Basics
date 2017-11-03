package com.test.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.test.Person;

public class StandardFunctionalInterfaces {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("hari","reddy",30),
				new Person("ravi","kumar",30),
				new Person("raju","babu",30)
				);
		
		// sort list by last name
		
		Collections.sort(persons, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// print all methods in the list
		
		performConditionally(persons,p->true,p->System.out.println(p));
		
		
		//prints all with lastname start with k
		performConditionally(persons,p -> p.getLastName().startsWith("k"),p->System.out.println(p));
		
		performConditionally(persons,p->p.getFirstName().startsWith("h"),p->System.out.println(p.getFirstName()));
	}

	private static void printAll(List<Person> persons)
	{
		for(Person p : persons)
		{
			System.out.println(p);
		}
	}
	private static void performConditionally(List<Person> persons,Predicate<Person> predicate,Consumer<Person> consumer)
	{
		for(Person p : persons)
		{
			if(predicate.test(p))
			{
				consumer.accept(p);
			}
		}
	}

	
}
