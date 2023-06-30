package task2;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.Arrays;

public class task2 {

    public static void main(String[] args) throws Exception {

        FileHandler handler = new FileHandler("log");
        Logger logger = Logger.getGlobal();
        logger.addHandler(handler);

        logger.info("Start");
        int[] arr = new int[]{12, 31, 29, 21, 77, 23, 92, 1, 25, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
            logger.info("Another iteration is completed");
        }
        logger.info("End");
        System.out.println(Arrays.toString(arr));

    }
}





// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.