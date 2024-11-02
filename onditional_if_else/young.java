import java.util.Scanner;

public class young {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in)){

            System.out.println("enter yoiur age");
            int age=sc.nextInt();

if(age>=18 && age<=45)
{
System.out.println("young child");

}
if(age>=46 && age<=100){
    System.out.println("older age");
}

else if(age>=1 && age<=17)
{
    System.out.println("child");
}



        }
    }
}
