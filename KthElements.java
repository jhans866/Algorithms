import java.util.Arrays;

public class KthElements {
    public static void getKthElement(int[] array, int k)
    {
        Arrays.stream(array).sorted().toArray();
        int[]  sortedStream = Arrays.stream(array).sorted().toArray();
       // System.out.println(Arrays.toString(sortedStream));
        /*for (int i = 0; i< sortedStream.length;i++)
        {
            System.out.println(sortedStream[i] + " ");
        }*/
        for (int i = array.length-k; i< sortedStream.length;i++)
        {
            System.out.println(sortedStream[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {-1 , -4, 4,5,12, 20, -8};
        getKthElement(arr, 3);
    }
}
