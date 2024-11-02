public class equal_ignore {
    public static void main(String args[]){

        String str="asif raza";
        String str1="aquib raza";
       // String str2="shahid raza";//
        String str3="ayan sohail";
        String str11="Aquib Raza";


boolean ignore=str1.equalsIgnoreCase(str11);
System.out.println("equal ignore = "+ignore);


boolean not_ignore=str.equalsIgnoreCase(str3);
System.out.println("not ignore = "+not_ignore);

    }
    


    
}
