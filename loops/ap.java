import java.util.Scanner;
class ap{

    public static void main(String[] args) {
        

        try(Scanner sc=new Scanner(System.in)){

            System.out.println("enter number a ,d,n");
int a=sc.nextInt();
int d=sc.nextInt();
int n=sc.nextInt();
int start=a;


for(int i=a; i<n;i++){

start=start+d;
System.out.print(start+(","));


}





        }
    }
}
