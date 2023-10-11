import java.security.cert.CertPathValidatorSpi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstNonRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {-1, 3, 2, -1, 0};
        Map<Integer, Integer> m = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        // Traverse array again and return
        // first element with count 1.
        int firstvalue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (m.get(arr[i]) == 1)
            {
                //firstvalue =m.get(arr[i]);
                list.add(arr[i]);
                System.out.println(arr[i]);
            }
        }

        System.out.println(list.get(0));
    }
}

