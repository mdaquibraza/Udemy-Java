import java.util.Scanner;
class factorial{
public static void main(String args[]){

try(Scanner sc=new Scanner(System.in)){

int n=sc.nextInt();
int fact=1;

/*for(int i=n; n>1; n--){


fact=fact*n;
System.err.println(fact);



}
}

}

}*/


while(n>1){


    fact=fact*n;


    System.out.println(fact);
    n--;
}

}
}
}
