package com.custom;

public class TestCustomException1
{
	    public static void main(String[] args) 
	    { 
	        try
	        { 
	            System.out.printf("1"); 
	            int data = 5 / 0; 
	        } 
	        catch(ArithmeticException e) 
	        { 
	            Throwable obj = new Throwable("Sample"); 
	            try {
	                throw obj;  
	            }
	            catch(Throwable e1)
		        {
		        	e1.getMessage();
		        }
	        } 
	       
	        finally
	        { 
	            System.out.printf("3"); 
	        } 
	        
	        System.out.printf("4"); 
	    } 
	} 

