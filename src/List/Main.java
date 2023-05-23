package List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер исполняемой программы: ");
//        int comanda =scanner.nextInt();
//        switch (comanda){
//            case 1:
//                break;
//            case 2:
//                break;
//        }
        LinkedListInt list = new LinkedListImpl();
        list.addFirstElement(1);
        list.addLastElement(2);
        list.addFirstElement(3);
        list.addElementAtIndex(5,2);
        list.removeElementAtIndex(3);

        System.out.println(list);
        System.out.println(list.getSize());
        System.out.println(list.getElement(2));
    }
}