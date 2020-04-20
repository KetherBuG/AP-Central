import java.util.*;
public class ArrayListV
{
    public void exe(){
        int j = 0;
        ArrayList<Integer> myList  = new ArrayList();

           while (j < myList.size())
           {
               if (myList.get(j) == 0)
               {
                   myList.remove(j);
                }
                j++;
            }
        System.out.println("Question 7.11: The error after executing with the input (1,0,0,2)"+
        "is that the out put will be 1,0,2 since the size of the arrayList is decreasing \nso that that when J is equal to 2 its refering to the last element of the list");
    }
}
