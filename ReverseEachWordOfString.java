public class ReverseEachWordOfString {
    public static String reverseString(String s)
    {
        if (s==null||s.isEmpty())
        {
            return s;
        }
        else {
            String [] arr = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++)
            {
                sb.append(reverse(arr[i]));
                sb.append(" ");
            }
            return sb.toString();
        }
    }
    public static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseString("hello world"));
    }
}
