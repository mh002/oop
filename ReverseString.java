/* NAME : AKSHAY MR
   ROLLNO : 08
   KTUID : IDK19CS008 */

import java.util.Scanner; 
class ReverseString {
    public static void main(String[] args)
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
        System.out.println(reversed);
    }    
}
        