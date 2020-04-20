import java.util.*;
public class ArrayListIV
{
    public void exe(){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        System.out.println("Question 7.9: The result of executing code of 7.9 is: ");
        for (int i = 0; i < arrList.size(); i++)
        {
            System.out.print(arrList.remove(i));
        }
        System.out.println("Note to myself: This is the same mistake as 7.8 as"+
       " \nI didn't realize that the size of the arrayList is dynamic");
    }
}
