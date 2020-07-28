package manager;

import java.util.Scanner;

public class Menu {
    manager.actionManager actionManager = new actionManager();
    private Scanner scr = new Scanner(System.in);
    private String[] items = {
            "1. New user.",
            "2. Modify user.",
            "3. Delete user.",
            "4. Show list of users.",
            "5. Exit."};

    public void dropMenu() {
        while (true) {
            showOptions();
            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
            System.out.print("Please make a choice: ");
            String choice = scr.next();
            int check = switch (choice) {
                case "1" -> {
                    actionManager.createUser();
                    yield 1;
                }
                case "2" -> {
                    actionManager.modifyUser();
                    yield 2;
                }
                case "3" -> {
                    actionManager.deleteUser();
                    yield 3;
                }
                case "4" -> {
                    actionManager.dropUsers();
                    yield 4;
                }
                case "5" -> {
                    exit();
                    yield 5;
                }
                default -> 1;
            };
        }
    }

    private void showOptions() {
        for (String item : items) {
            System.out.println(item);
        }
    }

    private void exit() {
        System.exit(0);
    }
}
