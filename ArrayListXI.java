public class ArrayListXI
{
    int[] arr = {30,40,10,50,20};
    int count = 0;
public void exe(){
    selectionSort(arr);
    System.out.println("Question 7.18: The result after executing the code in 7.18 is that elements[minIndex] = temp is ran" + count + "times");
}
public void selectionSort(int[] elements)
{
for (int j = 0; j < elements.length - 1; j++)
{
int minIndex = j;
for (int k = j + 1; k < elements.length; k++)
{
if (elements[k] < elements[minIndex])
{
minIndex = k;
}
}
if (j != minIndex)
{
int temp = elements[j];
elements[j] = elements[minIndex];
elements[minIndex] = temp;   // line 19
count++;
}
}
}
}
