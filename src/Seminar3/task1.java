package Seminar3;
import java.util.Arrays;

public class task1 {
    public static int[] array = {12, 74, 1, 83, 26, 67, 21, 45, 89, 16};
    public static void main(String args[])
    {
        System.out.println("До -  " + Arrays.toString(array));
        sort(0, array.length-1);
        System.out.println("После -  " + Arrays.toString(array));
    }
    public static void sort(int arrStart, int arrFinish) {
        if (arrStart == arrFinish)
            return;

        int arrMid = (arrStart + arrFinish) / 2;

        sort(arrStart  , arrMid);
        sort(arrMid + 1, arrFinish);
        merge(arrStart, arrFinish);
    }

    public static void merge(int arrBegin, int arrEnd) {

        int[] newArr = new int[arrEnd + 1];

        int arrMidBegin = (arrBegin + arrEnd) / 2;
        int x = arrBegin;
        int y = arrMidBegin + 1;
        int cntr = 0;

        while ((x <= arrMidBegin) || (y <= arrEnd)) {
            if (x > arrMidBegin) {
                newArr[cntr++] = array[y++];
                continue;
            }
            if (y > arrEnd) {
                newArr[cntr++] = array[x++];
                continue;
            }
             if (array[y] > array[x]) {
                newArr[cntr++] = array[x++];
            } else {
                newArr[cntr++] = array[y++];
            }
        }
        for (int i = 0; i < arrEnd - arrBegin + 1; i++) {
            array[i + arrBegin] = newArr[i];
        }
    }
}
//   Реализовать алгоритм сортировки слиянием

