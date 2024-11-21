
import java.util.Scanner;
public class searchElementArray {
  public static void main(String[] args) {
    
try(Scanner sc=new Scanner (System.in)){

System.out.println("Enter number");

int no=sc.nextInt();



int A[]={2,5,3,6,8,9,12,13,15,};
for(int i=0; i<A.length;i++){

if(A[i]==no){

System.out.println(i);
System.exit(0);
}


}

System.out.println("not found");
}


  }
    

}
