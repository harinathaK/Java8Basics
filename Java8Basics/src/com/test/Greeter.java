package com.test;

public class Greeter {

	public void greet(Greeting greeting)
	{
		greeting.perform();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting h = new HelloWorldGreeting();
		Greeter g = new Greeter();
		g.greet(h);
		
		
		MyLambda myLambdaFunction = () ->{
			System.out.println("hello world lambda000");
		};
		
		// or
		
		Greeting myLambdaFunction1 = () ->{
			System.out.println("hello world lambda000");
		};
		
		MyAdd addFunction =(int a,int b)->a+b;
		
		
		
		
	}

}

interface MyLambda
{

	void perform();
	
}
interface MyAdd
{
	int add (int x,int y);
}
