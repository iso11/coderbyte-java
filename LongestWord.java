import java.util.Scanner;

class LongestWord {  
  String LongestWords(String sen) { 
    String[] array;//문장잘라서 넣는배열
    int max=0;//가장긴인덱스저장용
    int i=0;
    
    sen=sen.replaceAll("[^a-zA-Z ]","");
    
    array = sen.split(" ");
    
    for(i=1;i<array.length;i++){
      if(array[max].length()<array[i].length())
        max=i;
    }  
       
    return array[max];	
    }
    
  
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    LongestWord c = new LongestWord();
    System.out.print(c.LongestWords(s.nextLine())); 
  }   
  
}  
