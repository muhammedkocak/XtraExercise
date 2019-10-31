package combSort;

public class combsort2 {
    public void combSort(int[] array) {
        int gap = array.length;
        double shrink = 1.3;
        boolean swapped = false;
        int i;
        while (gap != 1 || swapped) {
            gap = (int) (gap / shrink);
            if (gap < 1)
                gap = 1;
            i = 0;
            swapped = false;
            while (i + gap < array.length) {
                if (array[i] > array[i + gap]) {
                    swapKeys(array, i, i + gap);
                    swapped = true;
                }
                i++;
            }
        }
    }

    public void swapKeys(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
