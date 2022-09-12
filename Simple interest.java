import java.util.*;

public class Main {

	public static void main(String[] args) 	{

	    int y,amt,age,si;

	    Scanner s= new Scanner(System.in);

	    System.out.print("Enter the amount");   

	     amt=s.nextInt();

	     System.out.print("Enter the years");   

	     y=s.nextInt();

	     System.out.print("Enter the age");   

	     age=s.nextInt();

	     if(age>34 && age<54)

	     {

	         si=(amt*y*12)/100;

	         System.out.print("simple interest is " +si); 

	         

	     }

	     else

	     {

	         si=(amt*y*10)/100;

	         System.out.print("simple interest is " +si); 

	     }

	}

}

	    

	    
