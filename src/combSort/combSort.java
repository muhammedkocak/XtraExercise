package combSort;

public class combSort {
    public static void main(String[] args) {
    int values[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0, 33, -666, 1, 256, 111, 001};//Array met getallen
    double shrink = 1.3;//Shrink
    double gap = (int) (values.length) / shrink;
    if (values.length > 0) {
        gap = (int) (values.length) / shrink;
    }
    while (gap > 1) {
        int i = 0;
        int j = (int) Math.floor(gap);
        while (j != values.length) {
            if (values[i] > values[j]) {
                values[i] = values[i] ^ values[j];
                values[j] = values[j] ^ values[i];
                values[i] = values[i] ^ values[j];
            }
            i++;
            j++;
        }
        gap = gap / shrink;

        if (gap < 1) {
            gap = 1;
        }
    }
    System.out.println(java.util.Arrays.toString(values));
}
}