import java.util.*;
public class ArrayListII
{
    public void exe(){
       ArrayList<String> syllables = new ArrayList<String>();

       syllables.add("LA");

       syllables.add(0, "DI");

       syllables.set(1, "TU");

       syllables.add("DA");

       syllables.add(2, syllables.get(0));

       syllables.remove(1);
       System.out.println("Question 7.5: The result of executing the code is: ");
       System.out.print(syllables.toString());
       System.out.println("Note to myself: the add(int, TYPE) adds TYPE after the int position. ");
    }


}