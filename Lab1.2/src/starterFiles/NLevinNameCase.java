package starterFiles; 

/**
 * Created by Mr.Levin  on 9/28/17.
 */
public class NLevinNameCase implements NameCase {
    public static void main (String [] args)
    {
    	NameCase test = new NLevinNameCase();
    	System.out.println("This is where you should test your code.");
    	System.out.println(test.titlecase("bJEWEJE"));
    	System.out.println(test.swapcase("Levin"));
    	System.out.println(test.alternatingcase("This is where you should test your code"));
    	
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
