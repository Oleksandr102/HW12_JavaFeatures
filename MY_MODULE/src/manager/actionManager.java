package manager;

import service.UserManager;

import java.util.Scanner;

public class actionManager {
    Scanner scr = new Scanner(System.in);
    UserManager userManager = new UserManager();

    void createUser() {
        System.out.print("Enter your name: ");
        String name = scr.next();

        System.out.print("Enter your login: ");
        String login = scr.next();

        System.out.print("Enter your phone: ");
        long phone = Long.parseLong(scr.next());

        System.out.println("Your id is: " + userManager.getUserId());
        userManager.create(name, login, phone);
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    }

    void modifyUser() {
        System.out.print("Please, enter your ID to update account info. ");
        int userId = scr.nextInt();
        userManager.delete(userId);

        System.out.print("New name: ");
        String name = scr.next();

        System.out.print("New login: ");
        String login = scr.next();

        System.out.print("New phone: ");
        long phone = Long.parseLong(scr.next());

        userManager.create(name, login, phone);
        System.out.println("Your account has been updated.");
    }

    void deleteUser() {
        System.out.print("What account ID you want to be deleted? ");
        int userId = scr.nextInt();
        userManager.delete(userId);
        System.out.println("Your account has been deleted.");
    }

    public void dropUsers() {
        userManager.showUsers();
        System.out.println();
    }
}
