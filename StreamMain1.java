import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        //create a list and filter all even numbers from list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(2);
        list.add(4);
        Stream<Integer> stream = list.stream();
        List<Integer> l1 = stream.filter(i->i%2 == 0).collect(Collectors.toList());
        System.out.println(l1);

        System.out.println(list.stream().filter(i->i>10).collect(Collectors.toList()));

    }
}
