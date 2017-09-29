package starterFiles;
/**
 * Created by Thomas Zhou.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class TZhouNameCase implements NameCase{

	 public static void main (String [] args)
	 {
		 NameCase user = new TZhouNameCase();
		 Scanner name = new Scanner(System.in);
		 System.out.println("What is your name?");
		 String s = name.next();
	     while(true)
	     {
	    	 try
	    	 {
	    		 System.out.println("Choose one of the following:");
	    		 System.out.println("1 - Titlecase");
	    		 System.out.println("2 - sWAPCASE");
	    		 System.out.println("3 - aLtErNaTiNg CaSe");
	    		 int selection = name.nextInt();
	    	     if (selection == 1)
	    	     {
	    	    	 System.out.println(user.titlecase(s));
	    	    	 break;
	    	     }
	    	     else if (selection == 2)
	    	     {
	    	    	 System.out.println(user.swapcase(s));
	    	    	 break;
	    	     }
	    	     else if (selection == 3)
	    	     {
	    	    	 System.out.println(user.alternatingcase(s));
	    	    	 break;
	    	     }
	    	     else
	    	     {
	    	    	 System.out.println("You did not choose one of the choices. Please try again.");
	    	     }
	    	 }
	    	 catch (InputMismatchException e)
	    	 {
	    		 System.out.println("You did not type a number! Please try again.");
	    		 name.next();
	    	 }
	     }
	 }

	 public String titlecase(String name)
	 {
	    return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
	 }
	 public String swapcase(String name)
	 {
	     return name.substring(0,1).toLowerCase() + name.substring(1).toUpperCase();
	 }
	 public String alternatingcase(String name)
	 {
		 String current = "";
		 for (int i = 0; i < name.length();i++)
		 {
	    	if (i % 2 == 0)
	    	{
	    		current += name.substring(i, i + 1).toLowerCase();
	    	}
	    	else
	    	{
	    		current += name.substring(i, i + 1).toUpperCase();
	    	}
	    }
	    return current;
	 }
}
