public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(81));
    }
    public static String isPrime(int n)
    {
        if (n==0 || n==1)
        {
            return "Not Prime";
        }
        if (n==2 || n==3)
        {
            return "Prime";
        }
        else
            for ( int i= 2; i <= n/2; i++) //i =10
            {
                if (n%i==0)
                    return "Not Prime";
            }
        return "Prime";
    }
}
