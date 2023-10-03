public class IsStringUpperCase {
    public static boolean isStringUpper(String s1)
    {
        return s1.chars().allMatch(Character::isLowerCase);

    }
    public static void main(String[] args) {
        String s1  = "Read";
        System.out.println(isStringUpper(s1));
    }
}
