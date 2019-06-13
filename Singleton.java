package com.program;

public class Singleton 
{
  private static Singleton object;
  static
      {
	  object = new Singleton();
	  }
  private Singleton()
  {
	  
  }
  public static Singleton getInstance()
  {
	  return object;
  }
  public void testme()
  {
	  System.out.println("Hey... it is working!!!");
  }
  public static void main (String a[])
  {
	  Singleton ms = getInstance();
	  ms.testme();
  }
}
