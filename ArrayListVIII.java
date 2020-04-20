
public class ArrayListVIII
{
    public void exe(){
System.out.println("Question 7.15: In 7.15, the method seqSearch returns the value of j\n as j is declared as an integer representing the index of the array");
System.out.println("However, in the method seqSearch, the codered used a for-each loop, where j \n in this case represents the sepecific element of the array rather than the index"); 
}
   public int seqSearch(int[] arr, int target)
{
for (int j = 0; j < arr.length; j++)
{
if (arr[j] == target)
{
return j;
}
}
return -1;
}
    public int seqSearch2(int[] arr, int target)
{
for (int j : arr)
{
if (j == target)
{
return j;
}
}
return -1;
}
}
