/*
 *  Name: Akshay MR
 *  Roll Number: 08
 *  KTU ID: IDK19CS008
 */

// Use a class name which is matching to the file name.
import java.util.Scanner; // Import the Scanner class

class SecondSmallest{
  public static void main(String[] args) {
    int n, y, i;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter the value of N:");
    n = myObj.nextInt(); // Read user input
    
    // Create an array of integers for N numbers
    int[] intArray = new int[n] ;
    // Read n numbers in a for loop
    for( i=0;i<n;i++)
    {
    intArray[i] = myObj.nextInt();
    }
    // find the second smallest number secsmall
    int max =0;
    for(i=0;i<n;i++)
    {
        if(intArray[i] > max)
        max = intArray[i];
    } 
    int small ,secondsmall;
     small =secondsmall = max;
    for (i = 0; i <n; i++)
    {
        if (intArray[i] < small)
        {
            secondsmall = small;
            small =intArray[i];
        } 
        else if (intArray[i] < secondsmall && intArray[i] !=small ) 
        {
            secondsmall =intArray[i];
        }

    }
    if(secondsmall == max)
    {
        System.out.println("x");
    }
    else
    {
         //Print the second smallest number 
    System.out.println(secondsmall); 
    }
  
   
  }
} 

