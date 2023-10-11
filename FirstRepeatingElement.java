import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int [] arr = {1,5,3,4,3,5,6};
        HashMap <Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0 ; i<arr.length; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != 1)
            {
                //firstvalue =m.get(arr[i]);
                list.add(arr[i]);
                //System.out.println(arr[i]);
            }
        }
        System.out.println(list.get(0));
    }
}
