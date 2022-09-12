import java.util.Scanner;

public class student

{

   public static void main(String args[])

    {

        int marks[] = new int[4];

        int p,c,m,py;

        float total=0, avg;

        Scanner s= new Scanner(System.in);

      System.out.print("Enter the marks in python: ");    py=s.nextInt();

        System.out.print("Enter the marks in c programming: ");

        c=s.nextInt();

      System.out.print("Enter the marks in Mathematics: ");

      m=s.nextInt();

      System.out.print("Enter the marks in Physics: ");

      p=s.nextInt();

      total=m+c+py+p;

        avg = total/4;

        System.out.print("The student Grade is:");

        if(avg>=75)

        {

            System.out.print("DISTINCTION");

        }

        else if(avg>=60 && avg<75)

        {

           System.out.print("FIRST DIVISION");

        } 

        else if(avg>=50 && avg<60)

        {

            System.out.print("SECOND DIVISION");

        }

           else if(avg>=40 && avg<50)

        {

            System.out.print("THIRD DIVISION");

        }

        

        else

        {

            System.out.print("FAIL");

        }

    }

}
