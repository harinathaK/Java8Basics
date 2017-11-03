package com.test;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("inside run");
			}
		}
				);
		
		thread.start();
		
		Thread myLambdaThread = new Thread(()->System.out.println("lambda runnable"));
		
		myLambdaThread.run();
	}

}
