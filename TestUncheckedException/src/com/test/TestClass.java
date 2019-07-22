package com.test;

public class TestClass extends TestClass1
{	
TestClass(String text)
 {
	//super(); 
	System.out.println("TestClass");
	
 }
public static void main(String args[])
  {
	/*int c = 0;
	int a=10;
	c=a/0;
	System.out.println(c);
	System.out.println("exception handled");*/
	TestClass test=new TestClass("abcd");
  }
}
class TestClass1
{
	public TestClass1()
	{
		System.out.println("TestClass1");
	}
}
