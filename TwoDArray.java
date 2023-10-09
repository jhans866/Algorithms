public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {3, 6}};
        System.out.println(arr.length + " "+ arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
