import java.util.Scanner;

                 

public class JavaProgram

{

    public static void main(String args[])

  {

    int first, second, subtract;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Total no of staff uers : ");

    first = scanner.nextInt();

    System.out.print("Enter Total no of sudent users : ");

    second = scanner.nextInt();

    subtract = first - second;

    System.out.println("Difference = " + subtract);

  }

}
