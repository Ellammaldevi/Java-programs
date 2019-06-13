package com.program;

class Parent
{
	public void display()
	{
		System.out.println("Parent method is executed");
	}
}
class Child extends Parent
{
	@Override
	public void display()
	{
		System.out.println("Child method is executed");
	}
}
public class Overriding
{
 public static void main (String args[])
 {
	 Parent parentObject = new Parent();
	 parentObject.display();
	 Parent childObject = new Child();
	 childObject.display();
 }
}
