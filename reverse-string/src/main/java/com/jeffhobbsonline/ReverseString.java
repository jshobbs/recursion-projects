package com.jeffhobbsonline;

/**
 *
 */
public class ReverseString 
{
  	public static void main(String[] args) {
  		String greeting = "hello";
		System.out.println(reverseString(greeting));
  	}

	private static String reverseString(String greetString){
		
		String strBackwards = "";

		if(greetString.length() == 0){
			return strBackwards;
		}
		else{
			strBackwards += greetString.charAt(greetString.length() - 1);
			//System.out.println(strBackwards);
			return strBackwards += reverseString(greetString.substring(0, greetString.length() - 1));
		}
	}
}