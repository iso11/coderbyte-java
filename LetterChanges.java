import java.util.Scanner;

class LetterChanges {  
  void LetterChanges(String str) { 
    
    //캐릭터는 다음껄로. 그중에서 아에이오우는 대문자로.
	str=str.toLowerCase();
    
    //판단해야할것 : 알파벳인지(z)인  98-123
    
    int[] wow = new int[str.length()];
    
    for(int i=0;i<str.length();i++){
    	if((int)str.charAt(i)>=97&&(int)str.charAt(i)<=122){
    		if((int)str.charAt(i)==122)
    			wow[i]=97;
    		else if(str.charAt(i)==' ')
                continue;
    		else
    			wow[i]=str.charAt(i)+1;
    	}
    	else
    		wow[i]=str.charAt(i);
    		
    }        
    for(int i=0;i<wow.length;i++){
    	if(wow[i]==97||wow[i]==101||wow[i]==105||wow[i]==111||wow[i]==117){
    		wow[i]-=32;
    		System.out.print((char)wow[i]);}
    	else
    		System.out.print((char)wow[i]);
    }    
  }   
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    LetterChanges c = new LetterChanges();
    c.LetterChanges(s.nextLine()); 
  }     
} 
