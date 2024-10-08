import java.util.Scanner;
class cubiod{
    public static void main(String args[]){
try(Scanner sc=new Scanner(System.in)){
    int l ,b , h;
    int TotalArea , volume;
System.out.println("enter lenght ,breadth , height");
l =sc.nextInt();
b=sc.nextInt();
h=sc.nextInt();
System.out.println("lenght is  "+l);
System.out.println("width is  "+b);
System.out.println("height is  "+h);
TotalArea=2*(l*b+l*h+b*h);
System.out.println(TotalArea);

volume=l*b*h;
System.out.println(volume);


}
    }

}


