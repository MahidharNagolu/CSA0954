import java.util.*;

import java.util.stream.IntStream;

public class Demo {

   public static void main(String[] args) {

      int m,n,i;

      Scanner s=new Scanner(System.in);

      System.out.println("Enter the range m and n ");

      m=s.nextInt();

      n=s.nextInt();

      System.out.println("Enter n num to be skip");

      i=s.nextInt();

      IntStream intStream = IntStream.range(m, n);

      intStream.skip(i).forEach(System.out::println);

   }

}

