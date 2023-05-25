package List;

import java.util.Scanner;

public class Check {
    LinkedListInt list = new LinkedListImpl();
    public void AutoCheck(){
        list.addFirstElement(1);
        list.addLastElement(2);
        list.addFirstElement(3);
        list.addElementAtIndex(5,2);
        list.removeElementAtIndex(3);

        System.out.println("Список: " + list);
        System.out.println("Длинна списка: " + list.getSize());
        System.out.println("2-ой элемент в списке: " + list.getElement(2));
    }

    public void UserCheck(){
        Scanner scanner = new Scanner(System.in);
        boolean Bool = true;
        while (Bool){
            System.out.print("Введите исполняемую программу: ");
            String comanda = scanner.nextLine();
            switch (comanda){
                case "add":
                    System.out.print("Куда добавить число: ");
                    String index = scanner.nextLine();
                    switch (index){
                        case "first":
                            System.out.print("Введите значение: ");
                            Integer value = scanner.nextInt();
                            list.addFirstElement(value);
                            break;
                        case "index":
                            System.out.print("Введите значение: ");
                            Integer value_1 = scanner.nextInt();
                            System.out.print("Введите индекс: ");
                            Integer ind = scanner.nextInt();
                            list.addElementAtIndex(value_1,ind);
                            break;
                        case "last":
                            System.out.print("Введите значение: ");
                            Integer value_2 = scanner.nextInt();
                            list.addLastElement(value_2);
                            break;
                    }
                    break;

                case "remove":
                    System.out.print("Откуда удалить число: ");
                    String index_1 = scanner.nextLine();
                    switch (index_1){
                        case "first":
                            list.removeFirstElement();
                            break;
                        case "index":
                            System.out.print("Введите индекс: ");
                            Integer ind = scanner.nextInt();
                            list.removeElementAtIndex(ind);
                            break;
                        case "last":
                            list.removeLastElement();
                            break;
                    }
                    break;

                case "print":
                    System.out.print("Что вывести: ");
                    String cmnd = scanner.nextLine();
                    switch (cmnd){
                        case "size":
                            System.out.println(list.getSize());
                            break;
                        case "Element":
                            System.out.print("Введите индекс: ");
                            Integer ind = scanner.nextInt();
                            System.out.println(list.getElement(ind));
                            break;
                        case "list":
                            System.out.println(list);
                            break;
                    }
                    break;
                case "exit":
                    System.out.println("___");
                    Bool = false;
                    break;
            }
        }
    }

}

