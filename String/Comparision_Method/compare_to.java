public class compare_to {
    public static void main(String args[]){

        String str="asif raza";
        String str1="aquib raza";
       // String str2="shahid raza";//
        String str3="ayan sohail";
        String str11="AQUIB RAZA";
String str4=new String("raza");
String str5=new String("aquib raza");


    int compare=str.compareTo(str3);
        
        System.out.println( compare);



        int compare2=str3.compareTo(str);
        System.out.println( compare2);


        int same=str1.compareTo(str11);
        System.out.println( "compare blw capital and small =="+same);



int new_string=str1.compareTo(str4);
System.out.println( "new string=="+new_string);



int new2=str1.compareTo(str5);
System.out.println("new 2 same name but new string == "+new2);





    }
}
