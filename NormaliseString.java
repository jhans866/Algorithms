public class NormaliseString {
    public static String normalizeStr(String s)
    {
        return s.toLowerCase().trim().replace(" ","");
    }
    public static void main(String[] args) {
        System.out.println(normalizeStr("  the cat IS not Happy "));
    }
}
