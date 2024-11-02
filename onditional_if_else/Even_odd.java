import java.util.Scanner;
public class Even_odd{

    public static void main(String[] args) {
        

        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter a number ");
int check=sc.nextInt();



if(check%2==0){

    System.out.println("not is even");
}
else{
    System.out.println("no is odd");
}

        }
    }
}




/*if

if(check%2!=0){

    System.out.println("not is odd");
}
else{
    System.out.println("no is even");
}
 */