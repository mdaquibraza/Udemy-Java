class email{

    public static void main(String args[]){

String str="razamdaquib658@gmail.com";

int str1=str.indexOf('@');

String username=str.substring(0,str1);
String domain=str.substring(str1+1,str.length());



boolean last=str.endsWith(".com");
int present=str.indexOf("gmail.com");
String str3=str.substring(2,6);
System.out.println("username   " +username +"  "     +  "domain   "+domain + " "  +"  no "+str3 +  "  " +"present "+present  +  "  "+ "last "+last);


    }
    
    }
