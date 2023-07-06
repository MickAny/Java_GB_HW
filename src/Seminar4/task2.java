package Seminar4;

import java.io.BufferedReader;
import java.io.IOException;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task2
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(
                List.of(35, 72, 21, 613, 91, 54, 73, 123, 845, 13, 31, 76, 224)
        );

        System.out.println(list);
        System.out.println("-".repeat(15));
       /* System.out.println(enqueue(list));
        System.out.println("-".repeat(15));*/

        /*System.out.println(dequeue(list));
        System.out.println(list);*/

        System.out.println(first(list));
        System.out.println(list);

    }

    public static LinkedList enqueue(LinkedList<Integer> list){
        System.out.println("Put the figure at the end of the LinkedList: ");
        int figureToAdd = sc.nextInt();
        list.addLast(figureToAdd);
        return list;
    }

    public static int dequeue(LinkedList<Integer> list){
        return list.pollFirst();
    }

    public static int first(LinkedList<Integer> list){
        return list.peekFirst();
    }


}
/*
2) Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.*/
