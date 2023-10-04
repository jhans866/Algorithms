public class ReverseString {
    public static String reverse(String s)
    {
        if (s==null||s.isEmpty())
        {
            return s;
        }
        else {
            StringBuilder sb =  new StringBuilder();
            for (int i = s.length()-1;i>=0;i--)
            {
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }
    }
    public static String reverse2(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("hello cat"));
        System.out.println(reverse2("hello cat"));
    }
}
