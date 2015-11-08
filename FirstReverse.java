import java.util.*; 
import java.io.*;

class Function {  
  void FirstReverse(String str) {
    char[] wow = new char[str.length()];
    for(int i=0;i<str.length();i++){
      wow[i]=str.charAt(i);    
    }
    for(int i=wow.length-1;i>=0;i--){
      System.out.print(wow[i]);    
    }
  } 
  public static void main (String[] args) { 
    // keep this function call here 
    Scanner  s = new Scanner(System.in);
    String str = s.nextLine();
    Function c = new Function();
    c.FirstReverse(str);
  }   
}           
