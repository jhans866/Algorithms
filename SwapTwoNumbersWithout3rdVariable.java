public class SwapTwoNumbersWithout3rdVariable {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        swap(n1,n2);

    }
    public static void swap(int a, int b) // a=2,b=3;
    {
        a = a+b;//5
        b=a-b; //-1
        a=a-b;
        System.out.println(a+" "+b);

    }
}
