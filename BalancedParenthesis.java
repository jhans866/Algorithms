import java.util.Stack;

public class BalancedParenthesis {
    public boolean isValid(String s) {
        // ToDo: Write Your Code Here.
        Stack<Character> s1 = new Stack<>();
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                s1.push(s.charAt(i));
            }
            else
            {
                if (s1.isEmpty()){
                    return false;
                }
                char top = s1.pop();
                if(s.charAt(i)==')'&& top!= '(')
                {
                    return false;
                }
                if(s.charAt(i)==']'&& top!= '[')
                {
                    return false;
                }
                if(s.charAt(i)=='}'&& top!= '{')
                {
                    return false;
                }
            }

        }
        return s1.isEmpty();
    }
    public static void main(String[] args) {
        BalancedParenthesis bp = new BalancedParenthesis();

        // Test cases to verify the solution
        String test1 = "{[()]}";
        String test2 = "{[}]";
        String test3 = "(]";

        System.out.println("Test 1: " + bp.isValid(test1));
        System.out.println("Test 2: " + bp.isValid(test2));
        System.out.println("Test 3: " + bp.isValid(test3));
    }
}
