public class compare_to_ignore {
   public static void main(String[] args) {
    
    String str="asif raza";
    String str1="aquib raza";
    //String str2="shahid raza";//
    String str3="ayan sohail";
    String str11="aquib raza";
   


boolean ignore=str1.equalsIgnoreCase(str11);
System.out.println(ignore);

boolean ignore2=str.equalsIgnoreCase(str3);
System.out.println(ignore2);


}



}
