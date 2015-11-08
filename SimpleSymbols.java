import java.util.*; 
import java.io.*;

class SimpleSymbols {  
  String SimpleSymbols(String str) { 
  
    String flag="true";
    
    if(str.charAt(0)>='a' && str.charAt(0)<='z'){
      flag="false";
    }    
    for(int i=1;i<str.length()-1;i++){
    	if(str.charAt(i)>='a' && str.charAt(i)<='z')
    		if(str.charAt(i-1)!='+'||str.charAt(i+1)!='+')
    			flag="false";
    }       
    return flag;    
  }   
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    SimpleSymbols c = new SimpleSymbols();
    System.out.print(c.SimpleSymbols(s.nextLine())); 
  }  
} 
