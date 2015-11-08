import java.util.*; 
import java.io.*;

class Function {  
  String CheckNums(int num1, int num2) { 
    
    if(num1==num2)
      return "-1";
    return (num1<num2?"true":"false");
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.CheckNums(s.nextLine())); 
  }   
  
} 
