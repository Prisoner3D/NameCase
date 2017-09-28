package starterFiles; 

/**
 * Created by Mr.Levin  on 9/28/17.
 */
public class NLevinNameCase implements NameCase {
    public static void main (String [] args)
    {
    	NameCase test = new NLevinNameCase();
    	System.out.println("This is where you should test your code.");
    	System.out.println(test.titlecase("Levin"));
    	System.out.println(test.swapcase("Levin"));
    	System.out.println(test.alternatingcase("Levin"));
    	
    }

    public String titlecase(String name)
    {
        return "";
    }
    public String swapcase(String name)
    {
        return "";
    }
    public String alternatingcase(String name)
    {
        return "";
    }

}
