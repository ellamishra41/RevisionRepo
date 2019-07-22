package com.custom;

public class ElectionVoteAgeVerification
{
	public static void main(String args[]) throws InvalidAgeException  
	{
		try {
		ageVerification(12);
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("after class");
	}

	public static void ageVerification(int age) throws InvalidAgeException 
	{
         if(age<18)
    	 throw new InvalidAgeException("invalid age");
	}	 	
}

class InvalidAgeException extends Exception  
{
	public InvalidAgeException(String age)
	{
    try {
		System.out.println("invalid age exception");
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
	}
}
