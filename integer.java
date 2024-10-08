import java.util.Scanner;
public class integer {
    public static void main(String args[]){
       try( Scanner sc=new Scanner(System.in)){
         int num ;
         System.out.println("enter integer number");
         num=sc.nextInt();
         System.out.println("your number is"+num);

       }
    }
}
