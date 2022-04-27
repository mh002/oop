import java.util.Scanner;
class EmployeeDetails
{
public String name;
public String date;
public int basicPay;
public EmployeeDetails()
{}
public EmployeeDetails(String name,String date,int basicPay)
{
    this.name=name;
    this.date=date;
    this.basicPay=basicPay;
}

public void salary(int basicPay)
{
   double DA =  0.6 * basicPay;
    double grossPay= DA + basicPay;
    System.out.println("the DA is: "+DA);
    System.out.println("the GrossPay is: "+grossPay);
}
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
   EmployeeDetails[] emp=new EmployeeDetails[10];
   for(int i=0;i<3;i++)
   {
       System.out.println("Enter the details of employee with id:"+(i+1));
        emp[i]=new EmployeeDetails();
        System.out.println("enter the Name");
        emp[i].name=sc.nextLine();
        System.out.println("enter the Date of joining");
        emp[i].date=sc.nextLine();
        System.out.println("enter the BasicPay");
        emp[i].basicPay=sc.nextInt();
        sc.nextLine();
   }
   
   System.out.println("***********The data of given employees is: ");
   for(int i=0;i<3;i++)
   {
    System.out.println("Student Details "+(i+1));
    System.out.println("The name of employee is: "+ emp[i].name);
    System.out.println("The date of joining is: "+emp[i].date);
    System.out.println("The basicPay: "+emp[i].basicPay); 
    emp[i].salary(emp[i].basicPay); 
    sc.nextLine();
   }
}
}

