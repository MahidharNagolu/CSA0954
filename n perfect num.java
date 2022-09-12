mport java.util.*;

 public class GFG

{

 public static void main (String[] args)

{

  int r;

  Scanner s =new Scanner(System.in);

  System.out.println("Enter the number");

  r=s.nextInt();

   if (r>0)

     {

  for (int i=1; i <=r; i++) 

{

    if (Math.sqrt(i) == (int)Math.sqrt(i))

      System.out.print(i + " ");

}

   else 

     System.out.println("INVALID");

     

}

}

