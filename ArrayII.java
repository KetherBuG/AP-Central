public class ArrayII
{
public void exe(){
    boolean duplicates = false;
    int[] arr = {1,23,3,3,4,5,6,7};

for (int x = 0; x < arr.length - 1; x++)

{
for (int y = x; y < arr.length; y++)
{
if (arr[x] == arr[y])
{
duplicates = true;
}
}
}
    System.out.println("Q 6.13: The result of executing the code with arr set up as int[] arr = {1,23,3,3,4,5,6,7}; is" + duplicates);
    System.out.println("The reason why y = x is because the code is seaching for whether the preceeding elements has the same value as the previous one");
    System.out.println("I missed it since I thought the code was to compare two different arrays");
}
}