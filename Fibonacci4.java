import java.util.Scanner;

  public class Main

 {  

public static void main(String args[])  

{    

 int n1=0,n2=1,n3,i,count;    

 System.out.println("enter the number");

 Scanner s =new Scanner(System.in);

 count=s.nextInt();

    

 for(i=2;i<count;++i)

 {    

  n3=n1+n2;    

  System.out.println(" "+n3);    

  n1=n2;    

  n2=n3;    

 }

}

}
