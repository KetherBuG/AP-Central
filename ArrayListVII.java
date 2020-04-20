public class ArrayListVII
{
    public void exe(){
        System.out.println("in 7. 13 if result = j is replaced with result = arr[j]\n then the program will return the target if its find, instead of returning the value of j"+
        "\n if target doesn't exist then the program will return -1");
    }
    public static int search(int[] arr, int target)

{
int result = -1;
for (int j = 0; j < arr.length; j++)
{
if (arr[j] == target)
{
result = arr[j];  // Line 8
}
}
return result;
}
}
