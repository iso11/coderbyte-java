import java.util.*; 
import java.io.*;

class SimpleAdding {  
  int SimpleAdding(int num) { 
    
    if(num==0)
      return 0;
       
    return num+SimpleAdding(num-1);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    int a=s.nextInt();
    SimpleAdding c = new SimpleAdding();
    System.out.print(c.SimpleAdding(a)); 
  }    
}
