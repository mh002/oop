import java.util.Scanner;
class binarySearch
{
 public static void main(String args[])
 {
  int mid,left=0,right,n,key,flag=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the no of elements");
  n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("enter elements in sorted way");
  for(int i=0;i<n;++i)
  arr[i]=sc.nextInt();
  System.out.println("enter the element to be searched");
  key=sc.nextInt();
  right=n-1;
  while(left<=right)
  {
   mid=(left+right)/2;
   if(arr[mid]==key)
   {System.out.println(key+" found at position "+(mid+1));
   ++flag;
   break;
   }
  if(key<arr[mid])
  right=mid-1;
  if(key>arr[mid])
  left=mid+1;
 }
 if(flag==0)
 System.out.println(key+" not found");
}}
