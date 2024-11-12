
import java.util.Scanner;

public class palidrome {
  public static void main(String[] args) {
    

try(Scanner sc=new Scanner(System.in)){

int n=sc.nextInt();


int m=n;

int re=0,r;
while(n>0){

r=n%10;

re=re*10+r;

n=n/10;


}
System.out.println(re);

if(re==m){


System.out.println("palindrome");
}
else{
System.out.println("not palindrome");


}


}

  }  
}
