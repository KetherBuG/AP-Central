
public class ArrayI
{
   public void exe(){
       String[] fruits = {"apples", "bananas", "cherries", "dates"};
       for (int i = 1; i <= fruits.length; i++)
{
System.out.println(fruits[i - 1]);
}
       System.out.println("Question 6.6, only in the for-loop ");
       System.out.print("for(int i = 0; i <= fruits.length;i++){System.out.println(fruits[i])}");
       System.out.println("the array will give out arrayout of index error since there's i<=fruits.length");
       System.out.println("Option III won't cause the problem since it prints fruit[i-1], which is within the bound");
       
    }
}
