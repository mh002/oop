import java. util. Scanner;
public class WordCount {  
      
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System. in);
          String string = scanner.nextLine();
          int count=0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;
            }
         System.out.println(count);   
    }  
}  