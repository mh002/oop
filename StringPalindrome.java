import java.util.Scanner; 
class StringPalindrome {
    public static void main(String[] arg)
    {
    Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] temparray = input.toCharArray();
         int left, right = 0;
        right = temparray.length - 1;
        for(left=0;left<temparray.length/2;left++)
        {
         char c=temparray[left];
        temparray[left]=temparray[right-left];
        temparray[right-left]=c;
        }
        String reversed = String.valueOf(temparray);
         if(input.equals(reversed))

        {
            System.out.println("PALINDROME");
        }
        else
        {
            System.out.println("NONPALINDROME");
        }
    }    
}