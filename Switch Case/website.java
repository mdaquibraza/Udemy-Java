
import java.util.Scanner;
class website{

    public static void main(String[] args) {
        

        try(Scanner sc=new Scanner(System.in)){

System.out.println("enter a domain");
        String web=sc.nextLine();

String site=web.substring(web.lastIndexOf("."));
switch (site) {
    case "com":
    System.out.println("commercial website");
        
        break;


        case ".in":
        System.out.println("linkedln web site");
break;


case ".gov":
System.out.println("government website");
break;



case ".org":
System.out.println("orgnise web site");
break;

case ".net":
System.out.println("network web site");
break;




    default:
    System.out.println("invalid");
        break;
}


        




    }
}
}