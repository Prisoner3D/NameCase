/**
 * Created by Mr. Levin on 9/28/17.
 * A interface for students to implement in their own class.
 * Defines the method signatures for Lab 1.2
 */
public interface NameCase {
    //accepts a string called name and returns the string in Titlecase
    //with the first letter capitalized and the rest lowercase
    public abstract String titlecase(String name);

    //accepts a string called name and returns the string in sWAPCASE
    //the first letter lowercase, all the rest uppercase
    public abstract String swapcase(String name);

    //accepts a string called name and returns the string in aLtErNaTiNgCaSe
    //alternating upper and lower case, first letter should be lowercase
    public abstract String alternatingcase(String name);
}
