import java.util.Scanner;

class LetterCapitalize {  
  void LetterCapitalize(String str) { 
	  
	  String[] array = str.split(" ");
	  
	  for(int i=0;i<array.length;i++){
		  array[i]=Character.toUpperCase(array[i].charAt(0))+array[i].substring(1); //substring(int s, int e) 문자열의 s부터 e까지를 string 객체로 반환 
		  
	  }
	  int j=0;
	  while(j<array.length-1){
		  System.out.print(array[j]+" ");
		  j++;
	  }
	  System.out.print(array[j]);
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    LetterCapitalize c = new LetterCapitalize();
    c.LetterCapitalize(s.nextLine()); 
  }   
  
}           
