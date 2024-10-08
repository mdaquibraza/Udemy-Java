import java.util.Scanner;

public class RootsQuadratic {
  public static void main(String args[]){
    int a, b, c;
    double r1,r2;
    try(Scanner sc=new Scanner(System.in)){
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("enter value a "+a);
        System.out.println("enter value b "+b);
        System.out.println("enter value c "+c);
        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(r1);
        r2=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(r2);
    }
  }  
}