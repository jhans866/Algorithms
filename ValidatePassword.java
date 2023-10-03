public class ValidatePassword {
    public static boolean isPasswordComplex(String pwd)
    {
        return pwd.chars().anyMatch(Character::isUpperCase) &&
                pwd.chars().anyMatch(Character::isLowerCase) &&
                pwd.chars().anyMatch(Character::isDigit);
    }
    public static void main(String[] args) {
        String password = "Password@1";
        System.out.println(isPasswordComplex(password));
    }
}
