package List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер исполняемой программы: ");
        String value = scanner.nextLine();
        Check autocheck = new Check();
        switch (value){
            case "auto":
                autocheck.AutoCheck();
                break;
            case "user":
                autocheck.UserCheck();
                break;
        }
    }
}