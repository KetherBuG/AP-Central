public class ArrayListIX
{
    int count = 0;
  public void exe(){
      int[] arr = {10,8,3,4};
      insertionSort(arr);
      System.out.println("Question 7.16: The time after running the code of the 7.16 is " + count);
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
count++;
}
elements[possibleIndex] = temp;
}
}
}
