package com.test;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringLengthLambda myLambda = (String s)->s.length();
		
		System.out.println(myLambda.getLength("hello"));
		}

	interface StringLengthLambda
	{
		int getLength(String s);
	}
}
