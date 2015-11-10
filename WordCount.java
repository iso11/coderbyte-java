//Using the Java language, have the function WordCount(str) take the str string parameter being passed and 
//return the number of words the string contains (ie. "Never eat shredded wheat" would return 4). 
//Words will be separated by single spaces. 

import java.util.*; 
import java.io.*;

class WordCount {  
  int WordCount(String str) { 	  
	  int count=1;	  
	  for(int i=0;i<str.length();i++)
		  if(str.charAt(i)==' ')
			  count++;
    return count;    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    WordCount c = new WordCount();
    System.out.print(c.WordCount(s.nextLine())); 
  }   
  
}
