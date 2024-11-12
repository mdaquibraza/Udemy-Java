
import java.util.Scanner;
public class reve {
 
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){

int a=sc.nextInt();

int r;
int re=0;

while(a>0)
{

r=a%10;

re=re*10+r;

a/=10;


}

System.err.println(re);





        }



    }
}
