import java.util.Scanner;

public class arm {
    


    public static void main(String[] args) {
        

        try(Scanner sc=new Scanner(System.in)){

int n=sc.nextInt();

int r;
int sum=0;;
int m=n;
while(n>0){

r=n%10;

n=n/10;


sum=sum+r*r*r;


}

if(sum==m){

System.out.println("Arm strong");}
else
{
    System.out.println("not arm strong");
}

        }
    }
}