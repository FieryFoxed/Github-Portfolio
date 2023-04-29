public class Activity16 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 4, 5}, {3, 7, 6, 7}, {4, 5, 6, 7}, {5, 7, 8, 9}};

        for(int row = 0; row < array1.length; row++)
        {
            for(int column = 0; column < array1[row].length; column++)
            {
                System.out.printf("%d ", array1[row][column]);
            }
            System.out.println();
        }
    }
}