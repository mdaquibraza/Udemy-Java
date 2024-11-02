
import java.util.Scanner;

class radix{
public static void main(String args[]){
try(Scanner sc=new Scanner(System.in)){


    String num;
    System.out.println("enter number " );
 num=sc.nextLine();
   



    if(num.matches("[01]+")){
System.out.println(" binary raidix is =2 ");
    }
else{
     if(num.matches( "[0-7]+")){
        System.out.println(" octal radix is =8");
    }
    else if(num.matches("[0-9]+")){
     
        System.out.println(" decimal radix is =10");
    }



    else if(num.matches("[0-9 ,A-F]+")){
        System.out.println(" hexa radix is =16");
    }
  
    
    else{
        System.out.println("not valid");
    }
}
}

 
  




}


}



