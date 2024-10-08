/**
 * AreaOfTriangle
 */
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String args[]){
try(Scanner sc=new Scanner(System.in)){
    int base , height ,area;
 
    System.out.println("enter base and height of triangle ");
     base=sc.nextInt();
     height=sc.nextInt();
    /*  System.out.println("base of triangle "+base);
     System.out.println("height of triangle "+height);*/
    area=base*height/2;
    System.out.println("area of triangle "+area);
    }
}
}

    
