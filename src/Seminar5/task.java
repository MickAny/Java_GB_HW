package Seminar5;

import java.util.*;

public class task{

    public static void main(String[] args) {
        Map<String, ArrayList<String>> bookPhone = new HashMap<>();
        addNumber("Иванов Иван", "+375 33 711-82-15", bookPhone);
        addNumber("Петров Петр", "+375 33 711-82-15", bookPhone);
        addNumber("Василевская Мария", "+375 33 613-76-91", bookPhone);
        addNumber("Городеев павел", "+375 29 845-81-13", bookPhone);
        addNumber("Жуков Марк", "+375 44 815-86-99", bookPhone);
        addNumber("Василевская Мария", "+375 44 561-81-35", bookPhone);
        addNumber("Романюк Елена", "+375 33 715-73-83", bookPhone);
        addNumber("Иванов Иван", "+375 29 156-44-21", bookPhone);
        addNumber("Куликова Элина", "+375 44 751-11-65", bookPhone);
        addNumber("Василевская Мария", "+375 29 761-75-99", bookPhone);
        printBook(bookPhone);

    }

    public static void addNumber(String key, String phoneNumber, Map<String, ArrayList<String>> map){
        if (map.containsKey(key)) {
            map.get(key).add(phoneNumber);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(phoneNumber);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<String>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(String el: item.getValue()){
                phones += el + " ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones + phones.length());
        }


    }

}
    /*Реализуйте структуру телефонной книги с помощью HashMap.
        Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
        их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован
        по убыванию числа телефонов.*/