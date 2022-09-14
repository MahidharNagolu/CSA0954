import java.util.Scanner;

public class Main

{

    public static void main(String args[])

    {

        float num,a,b,c; 

        Scanner sc = new Scanner(System.in);

       System.out.print("Enter The Number :\n\n");

        num = sc.nextFloat();

 

  a=num;

  b=num*num;

  c=num*num*num;

  System.out.println("\nOutput Is = " + a + " ,"+ b +" ,"+ c +"\n\n"); 

 }

}
