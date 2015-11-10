//Using the Java language, have the function ABCheck(str) take the str parameter being passed and return the string true 
//if the characters a and b are separated by exactly 3 places anywhere in the string at least once 
//(ie. "lane borrowed" would result in true because there is exactly three characters between a and b). 
//Otherwise return the string false. 

import java.util.*; 
import java.io.*;

class ABCheck {  
  String ABCheck(String str) { 
	  
	  String flag = "false"; 
	  
	  //전체를 돌면서 a가 나오면 -4이랑 +4이 b인지 판단  빈칸포함 
	  for(int i=0;i<str.length();i++)
	  {
		if(str.charAt(i)=='a')
			if(i>=4&&i<str.length()-4)	
			{
				if(str.charAt(i-4)=='b'||str.charAt(i+4)=='b')
					flag="true";
			}
			else if(i<4&&str.charAt(i+4)=='b')	//배열인덱스 벗어나는것 방지
				flag="true";	
			else if(i>=str.length()-4&&str.charAt(i-4)=='b')// 배열인덱스 벗어나는거 방지.
				flag="true";				
	  }
	  
    return flag;	
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    ABCheck c = new ABCheck();
    System.out.print(c.ABCheck(s.nextLine())); 
  }     
}
