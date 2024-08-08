public class StringReverse {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverse(str));
    }

        public static String reverse (String str)
        {
            if (str== null)
                throw new IllegalArgumentException("string is null");
            StringBuilder sb = new StringBuilder();
            char[] chars =  str.toCharArray();
            for (int i = str.length()-1; i>=0; i--) {
                sb.append(chars[i]);
            }
            return sb.toString();
        }

    }

