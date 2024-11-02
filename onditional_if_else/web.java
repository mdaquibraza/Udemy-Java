import java.util.Scanner;
public class web {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
System.out.println("enter url");
String url=sc.nextLine();

String website=url.substring(0,url.indexOf(":"));

if(website.equals("http")){
    System.out.println("hyper text transfer protocol");
}
else if(website.equals("fttp")){
    System.out.println("file text transfer protocol");
}
else if(website.equals("https")){
    System.out.println("file text transfer protocol sub");

        }
        String end=url.substring(url.lastIndexOf("."));



        if(end.equals(".com")){

            System.out.println("commercial web site");
        }
        else if(end.equals(".gov")){
            System.out.println("government website");
        }
        else if(end.equals(".in")){
            System.out.println("linkedln  website");
        }
        else if(end.equals(".net")){
            System.out.println("network  website");
    }
    else{
        System.out.println("invalid");
    }
}
    }
}
