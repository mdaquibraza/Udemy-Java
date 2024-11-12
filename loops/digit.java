import java.util.Scanner;
class digit{

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in)){
System.out.println("enter your n");
int n=sc.nextInt();

int r ;


while(n>0){
r=n%10;
n=n/10;


System.out.println(r);
}
System.out.println(n);






        }
    }
}
