import java.util.*; 
import java.io.*;

class TimeConvert {  
  void TimeConvert(int num) { 
	
	  System.out.print(num/60+":"+num%60);
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    TimeConvert c = new TimeConvert();
    c.TimeConvert(s.nextLine());
  }  
}
