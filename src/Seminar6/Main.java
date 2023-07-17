package Seminar6;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        LinkedList<Laptop> notebooks = new LinkedList<>();

        notebooks.add(new Laptop("16", "1000", "Windows", "Blue"));
        notebooks.add(new Laptop("8", "500", "Mac", "White"));
        notebooks.add(new Laptop("4", "2000", "Windows", "Black"));
        notebooks.add(new Laptop("16", "2000", "Linux", "Gray"));
        notebooks.add(new Laptop("32", "500", "Windows", "White"));
        notebooks.add(new Laptop("8", "1000", "Mac", "Black"));
        notebooks.add(new Laptop("32", "2000", "Linux", "Black"));
        notebooks.add(new Laptop("16", "1000", "Mac", "White"));
        notebooks.add(new Laptop("16", "1000", "Mac", "Red"));
        notebooks.add(new Laptop("8", "500", "Windows", "Blue"));
        notebooks.add(new Laptop("4", "200", "Windows", "White"));
        notebooks.add(new Laptop("16", "1000", "Mac", "White"));
        notebooks.add(new Laptop("16", "1000", "Linux", "Black"));


        boolean flag = true;
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> sortByRAM(notebooks);
                case 2 -> sortByHDD(notebooks);
                case 3 -> sortByOS(notebooks);
                case 4 -> sortByColour(notebooks);
                case 5 -> System.out.println(notebooks.toString());
                default -> flag = false;
            }

        }
    }

    private static void sortByRAM(LinkedList<Laptop> laptops) {
        System.out.println("Input the RAM option for searching: ");
        String variable = scanner.nextLine();

        ListIterator<Laptop> iterator = laptops.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getRAM().equals(variable)){
                continue;
            }else{
                iterator.remove();
            }
        }
        System.out.println(laptops);
    }

    private static void sortByHDD(LinkedList<Laptop> laptops){
        System.out.println("Input the HDD option for searching: ");
        String variable = scanner.nextLine();

        ListIterator<Laptop> iterator = laptops.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getHDD().equals(variable)){
                continue;
            }else{
                iterator.remove();
            }
        }
        System.out.println(laptops);
    }

    private static void sortByOS(LinkedList<Laptop> laptops){
        System.out.println("Input operation system option for searching: ");
        String variable = scanner.nextLine();

        ListIterator<Laptop> iterator = laptops.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getOS().equalsIgnoreCase(variable)){
                continue;
            }else{
                iterator.remove();
            }
        }
        System.out.println(laptops);
    }

    private static void sortByColour(LinkedList<Laptop> laptops){
        System.out.println("Input colour option for searching: ");
        String variable = scanner.nextLine();

        ListIterator<Laptop> iterator = laptops.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getColour().equalsIgnoreCase(variable)){
                continue;
            }else{
                iterator.remove();
            }
        }
        System.out.println(laptops);
    }


    private static void printActions(){                                //Выводит String-метод при вызове(перманентно)!!!
        String textBlock = """
                    Available actions: 
                                    
                    0 - to shutdown
                                    
                    1 - to find laptops by RAM
                                    
                    2 - to find laptops by HDD
                    
                    3 - to find laptops by OS
                    
                    4 - to find laptops by colour
                    
                    5 - to see the final result
                                    
                    Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");
    }
}

/*
1 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2 Создать множество ноутбуков.
3 Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
  отвечающие фильтру. Критерии фильтрации можно хранить в Map.
  апример: “Введите цифру, соответствующую необходимому критерию:

        ОЗУ

        Объем HDD

        Операционная система

        Цвет

4 Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

5 Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/

