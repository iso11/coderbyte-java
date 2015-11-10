//Using the Java language, have the function VowelCount(str) take the str string parameter being passed and 
//return the number of vowels the string contains (ie. "All cows eat grass" would return 5). 
//Do not count y as a vowel for this challenge. 

import java.util.*; 
import java.io.*;

class VowelCount {  
  int VowelCount(String str) { 
	  
	  int count=0;
	  
	  for(int i=0;i<str.length();i++){
		  if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			  count++;
	  }
       
    return count;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    VowelCount c = new VowelCount();
    System.out.print(c.VowelCount(s.nextLine())); 
  }   
}
