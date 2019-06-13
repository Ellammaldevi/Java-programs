package com.program;

public class ExceptionHandling 
{
		public static void main(String[] args)
		{
		  try
		  {
			  int a[] = new int[5]; 
			  a[5] = 30/0;
		  }
		  
		  catch (ArithmeticException e)
		  {
			  System.out.println("Task1 is completed");
		  }
		  catch (ArrayIndexOutOfBoundsException e)
		  {
			  System.out.println("Task2 is completed");
		  }
		  System.out.println("Remaining code");
		}
}

