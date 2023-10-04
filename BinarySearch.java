import java.util.Arrays;

public class BinarySearch {
    public static boolean binSearch(int[] arr, int item)
    {
        int min=0, max = arr.length - 1;
        while(min<=max)
        {
            int mid = (min+max)/2;
            if(item == arr[mid])
            {
                return true;
            }
            if (item>arr[mid])
            {
                min = mid+1;
            }
            if (item<arr[mid])
            {
                max = mid-1;
            }
        }
    return false;
    }
    public static void main(String[] args) {
        //If Array is not sorted we have to sort it
        int[] array = {1,3,5,6,7,8,10,12};
        Arrays.stream(array).sorted();
        System.out.println(binSearch(array,8));
        System.out.println(binSearch(array,2));
        System.out.println(binSearch(array,3));
    }
}
