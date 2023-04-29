import javax.swing.*;

public class sorting {
    public static int[] getArray() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter your first number: "));
        int input2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your second number: "));
        int input3 = Integer.parseInt(JOptionPane.showInputDialog("Enter your third number: "));
        int input4 = Integer.parseInt(JOptionPane.showInputDialog("Enter your fourth number: "));
        int input5 = Integer.parseInt(JOptionPane.showInputDialog("Enter your fifth number: "));

        int[] array = {input, input2, input3, input4, input5};
        return array;
    }

    public int[] quickSort(int[] unsorted, int start, int end){
        int pivot = partition(unsorted, start, end);
        if (start < pivot - 1){
            quickSort(unsorted, start, pivot - 1);
        }
        if (pivot < end){
            quickSort(unsorted, pivot, end);
        }
        return unsorted;
    }

    private int partition(int[] unsorted, int start, int end){
        int i = start;
        int j = end;
        int numbers;

        int pivot = unsorted[(start + end) / 2];

        while (i <= j)
        {

            while (unsorted[i] < pivot)
            {
                i++;
            }
            while (unsorted[j] > pivot){
                j--;
            }
            if (i <= j){
                numbers = unsorted[i];
                unsorted[i] = unsorted[j];
                unsorted[j] = numbers;
                i++;
                j--;
            }
            // return i;
        }
        return i;
    }
}

