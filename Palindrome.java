//Using the Java language, have the function Palindrome(str) take the str parameter being passed and 
//return the string true if the parameter is a palindrome, (the string is the same forward as it is backward) 
//otherwise return the string false. For example: "racecar" is also "racecar" backwards. 
//Punctuation and numbers will not be part of the string. 

import java.util.*; 
import java.io.*;

class Palindrome {  
  String Palindrome(String str) { 
	  str=str.replaceAll(" ","");	//빈칸 없애기 
	  String flag="true";
	  
	  for(int i=0;i<str.length()/2;i++)
	  {
		  if(str.charAt(i)!=str.charAt(str.length()-1-i))	//반접어서 비교하는방식.
			  flag="false";
	  }	  
    return flag;    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Palindrome c = new Palindrome();
    System.out.print(c.Palindrome(s.nextLine())); 
  }   
}
