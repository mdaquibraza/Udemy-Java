import java .util.Scanner;
public class leapYear {
  public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("enter year");
int year=sc.nextInt();
 
if(year%4==0)
{
    if(year%100==0)
    {
        if(year%400==0)
        {
             System.out.println("Its a Leap Year");
            
        }
        else
            System.out.println("Not a Leap Year");
            
        
    }
    else
    {
          System.out.println("Its a Leap Year");

    }
    
}
else
{
    System.out.println("Not a Leap Year");
}
        


}

  }
}

    

