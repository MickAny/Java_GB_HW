package Seminar4;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class task1
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>(
                List.of(35, 72, 21, 613, 91, 54, 73, 123, 845, 13, 31, 76, 224)
        );
        System.out.println("Natural order " + list);
        System.out.println("-".repeat(20));
        reverse(list);
        System.out.println();
        System.out.println("Reversed LinkedList " + reverseLinkedList(list));

    }

    public static void reverse(LinkedList<Integer> list){
        ListIterator<Integer> iterator = list.listIterator(list.size()-1);
        System.out.print("Reverse order " + list.getLast() + " ");
        while(iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }

    public static LinkedList reverseLinkedList(LinkedList<Integer> list1){
        LinkedList<Integer> list2 = new LinkedList<>();
        ListIterator<Integer> iterator = list1.listIterator(list1.size()-1);
        list2.add(list1.getLast());
        while(iterator.hasPrevious()) {
            list2.add(iterator.previous());
        }
        return list2;
    }


}
//1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.