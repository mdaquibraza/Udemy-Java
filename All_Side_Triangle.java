import java.util.Scanner;

public class All_Side_Triangle {
    public static void main(String Args[]){
        try(Scanner sc=new Scanner(System.in)){
            int a, b, c;
            float s;
            double area;
            System.out.println("enter the size of a,b,c");
            a=sc.nextInt();
            b=sc.nextInt(); 
            c=sc.nextInt();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
           
            s=(a+b+c)/2f;
            System.out.println(s);
            
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        }

    }
    
}
