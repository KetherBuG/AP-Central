public class ArrayIII
{
   public void exe(){
        int[] values = {-1,2,3,4,5,6};
        int maximum = values[0] ;
for (int k = 1; k < values.length; k++)
{
if (values[k] > maximum)
{
maximum = values[k];
}
}
System.out.println(maximum);
System.out.println("Q7. 13: The correct var maxium should be defined as the first element of the array instead of 0 or Integer.minimum");
System.out.println("since the for loop starts at the second value of the array so if the first value wasn't considered, which can be potentially the least");
    }
}
