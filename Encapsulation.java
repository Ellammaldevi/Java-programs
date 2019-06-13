package com.program;

public class Encapsulation
{
      String name;
      int Age;
      public String getname()
      {
    	  return name;
      }
 public void setname(String name)
 {
	 this.name = name;
 }
 public int getAge() 
 {
	 return Age;
 }
 public void setAge(int Age)
 {
	 this.Age = Age;
 }
 public static void main (String[] args)
 {
	 Encapsulation obj = new Encapsulation();
	 obj.setname("Ammu");
	 obj.setAge(21);
	 
	 System.out.println(obj.getname());
	 System.out.println(obj.getAge());
 }
}
