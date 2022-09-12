import java.util.*;

class GFG 

{

 static void perfectSquares(int l, int r)

{

  for (int i = l; i <= r; i++) 

{

    if (Math.sqrt(i) == (int)Math.sqrt(i))

      System.out.print(i + " ");

}

}

public static void main (String[] args)

{

int l , r ;

System.out.println("Enter the numbers");

Scanner s =new Scanner(System.in);

l=s.nextInt();

r=s.nextInt();

perfectSquares(l, r);

}

}

