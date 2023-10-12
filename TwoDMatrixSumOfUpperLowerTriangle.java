public class TwoDMatrixSumOfUpperLowerTriangle {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{3,4,5},{4,5,6}};
        int sumLower = 0;
        int sumSideUpper = 0, sumUpper= 0;
      //  System.out.println(arr[0].length);
        for (int i = 0; i<arr.length;i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(arr[i][j] +" ");
                sumLower = sumLower +arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sumLower);

        for (int i = 0; i<arr.length;i++)
        {
            for (int j= arr.length-1; j>=i; j--)
            {
                  //System.out.println("Vallue of i and j "+ i + " "+ j);
                System.out.print(arr[i][j] +" ");
                sumUpper = sumUpper +arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sumUpper);
     }
}
