import java.util.Scanner;
class menu{
public static void main(String args[]){

try(Scanner sc=new Scanner(System.in)){
  
    for(int i=1; i<=10; i++){

    System.out.println("ENTER TWO NUMBER");
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("ADD");
System.out.println("SUB");
System.out.println("MUL");
System.out.println("DIV");
sc.nextLine();






System.out.println("ENTER OPTION IN CAPITAL LETTER");
String option=sc.nextLine();



switch(option)
{
    case "ADD": System.out.println("Sum is "+(x+y));
                 break;
    case "SUB": System.out.println("Difference is "+(x-y));
                 break;
    case "MUL": System.out.println("Product is "+(x*y));
                 break;
    case "DIV": System.out.println("Ratio is "+(x/y));
                 break;
    default:     System.out.println("Invalid Option");
                 break;             
}
}
}    
}
}




