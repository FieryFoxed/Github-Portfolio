import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        sorting main = new sorting();
        int[] unsorted = main.getArray();

        System.out.println(Arrays.toString(unsorted));

        int[] sorted = main.quickSort(unsorted, 0, unsorted.length - 1);

        System.out.println(Arrays.toString(sorted));
    }
}
