import java.util.Arrays;

public class RotateArray {
    public static int[] rotArrayLeft(int[] arr)
    {
        //if ()
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++)
        {
            arr[i]= arr[i+1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        rotArrayLeft(array);
        Arrays.stream(array).forEach(System.out::println);
        System.out.println(rotArrayLeft(array));
    }
}
