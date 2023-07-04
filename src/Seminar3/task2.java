package Seminar3;

import java.util.ArrayList;
import java.util.List;

public class task2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(
                List.of(12, 74, 1, 83, 26, 67, 21, 45, 89, 16)
        );

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                list.remove(list.get(i));
            }
        }

        System.out.println(list);
    }

}
//    Пусть дан произвольный список целых чисел, удалить из него четные числа