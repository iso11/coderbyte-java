//Using the Java language, have the function AlphabetSoup(str) take the str string parameter being passed and 
//return the string with the letters in alphabetical order (ie. hello becomes ehllo). 
//Assume numbers and punctuation symbols will not be included in the string. 알파벳순서로 재배열.

import java.util.Arrays;
import java.util.Scanner;

class AlphabetSoup {  
  void AlphabetSoup(String str) { 
	  
	  char array[]=new char[str.length()];
	  
	  for(int i=0;i<array.length;i++){
		  array[i]=str.charAt(i);
	  }
	  Arrays.sort(array);
	  for(char a : array )
		  System.out.print(a);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    AlphabetSoup c = new AlphabetSoup();
    c.AlphabetSoup(s.nextLine()); 
  }     
}
