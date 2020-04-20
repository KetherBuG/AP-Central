
public class ArrayListX
{ int count = 0;
    public void exe(){
      int[] arr = {8,7,5,4,2,1};
      insertionSort(arr);
     System.out.println("Question 7.17: The time after running the code of the 7.17 is " + count);
    }
  public void insertionSort(int[] elements)
{
for (int j = 1; j < elements.length; j++)
{
int temp = elements[j];
int possibleIndex = j;

while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
{
elements[possibleIndex] = elements[possibleIndex - 1];
possibleIndex--;   // line 10
}
elements[possibleIndex] = temp;
count++;
}
}
    
}