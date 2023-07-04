package Seminar3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task3
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                List.of(12, 74, 1, 83, 26, 67, 21, 45, 89, 16)
        );

        Collections.sort(list);
        System.out.println("Минимальное число списка: " + list.get(0));
        System.out.println("Максимальное число списка: " + list.get(list.size()-1));
        System.out.println("Среднее значение списка: " + getAverage(list));

    }
    private static int getAverage(ArrayList<Integer> list)
    {
        int average = 0;
        for (int i:list) {
            average+=i;
        }

        return average/ list.size();
    }
}

 //   Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
