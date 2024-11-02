import java.util.Scanner;

public class grades {
  public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("enter your marks");
        int marks=sc.nextInt();

        if(marks>=80){
            System.out.println("A");
        }
        else{
            if(marks>=50 && marks<=79)
            System.out.println("B");
        }
if(marks>=30 && marks<=49){
    System.out.println("C");
}
if(marks>=10 && marks<=29){
    System.out.println("D");
}
else if(marks>=0 && marks<=9){

    System.out.println("no grade");
}
}


   
  
    }
}

