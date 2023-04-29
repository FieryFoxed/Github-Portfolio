
public class Activity16a {
    public static void main(String[] args) {
        int [][][][] array1 = new int [2][2][2][3];
        array1[0][0][0][0] = 1;
        array1[0][0][0][1] = 2;
        array1[0][0][0][2] = 3;
        array1[0][0][1][0] = 4;
        array1[0][0][1][1] = 5;
        array1[0][0][1][2] = 6;
        array1[0][1][0][0] = 7;
        array1[0][1][0][1] = 8;
        array1[0][1][0][2] = 9;
        array1[0][1][1][0] = 10;
        array1[0][1][1][1] = 11;
        array1[0][1][1][2] = 12;


        for (int row = 0; row < array1.length; row++) {
            for (int col = 0; col < array1[row].length; col++) {
                System.out.printf("%d ", array1[row][col]);
            }
            System.out.println();
        }
    }
}
