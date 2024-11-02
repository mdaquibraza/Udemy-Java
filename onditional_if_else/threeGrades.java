import java.util.Scanner;

public class threeGrades {
  public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
      
        System.out.println("enter your all three marks");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        int total;
        total=m1+m2+m3;
        System.out.println("your total marks of three is "+total);
        
        
        
        if(total>=80){
            System.out.println("A");
        }
        else{
            if(total>=50 && total<=79)
            System.out.println("B");
        }
if(total>=30 && total<=49){
    System.out.println("C");
}
if(total>=10 && total<=29){
    System.out.println("D");
}
else if(total>=0 && total<=9){

    System.out.println("no grade");
}
}


   
  
    }
}

