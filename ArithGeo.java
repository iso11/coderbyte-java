import java.util.*; 
import java.io.*;

class Function {  
  String ArithGeo(int[] arr) { 
      
    int ratio=arr[1]/arr[0];	
    int flag=0;	
	  
	  for(int i=2;i<arr.length;i++){//등비인지
        if(ratio!=arr[i]/arr[i-1]){
			  flag++;
          break;
        }
		  ratio=arr[i]/arr[i-1];
	  }
    ratio=arr[1]-arr[0];
    for(int i=2;i<arr.length;i++){//등차인지
        if(ratio!=arr[i]-arr[i-1]){
			  flag++;
          break;
        }
		  ratio=arr[i]-arr[i-1];
	  }
    if (flag>1)	//두개다 아닐때 실패
      return "-1";
    return "Arithmetic";    //등비 등차 하나라도 맞으면 flag가 1이됨.
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ArithGeo(s.nextLine())); 
  }   
  
}           
