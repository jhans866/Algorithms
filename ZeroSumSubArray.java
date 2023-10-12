import java.sql.SQLOutput;
import java.util.HashSet;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int arr[] = {-3, 4, 3, -1, 19,9};
        int sum = 0;
        boolean pointer=false;
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i<arr.length;i++)
        {
            sum = sum +arr[i];
            if(sum == 0||hs.contains(sum)||arr[i]==0)
            {
                //System.out.println("True");
                pointer= true;
            }
            else
            {
                //System.out.println("false");
            }
            hs.add(sum);
        }
        System.out.println(pointer);
    }
}
