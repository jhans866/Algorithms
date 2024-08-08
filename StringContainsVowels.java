import java.util.Locale;

public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsVowles("Hello"));
        System.out.println(stringContainsVowles("ghtf"));
    }

    public static boolean stringContainsVowles(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");

    }
}
