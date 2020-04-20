import java.util.*;
public class ArrayListIII
{
   public void exe(){
       ArrayList<String> words = new ArrayList<String>();
       words.add("mat");
       words.add("new");
       words.add("open");
       words.add("pet");
       int i = 0;
       while (i < words.size())
       {
           words.remove(i);
           i++;
        }
        System.out.println("Question 7.8: The result of executing the code in 7.8 MC is : ");
        System.out.println(words.toString());
        System.out.println("Note to myself: The point i missed is that once"+
        "the remove statement is executed then the number of words.size() will decrease");
        
    }
}
