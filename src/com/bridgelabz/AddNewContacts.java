package com.bridgelabz;

import javax.swing.*;
import java.util.Scanner;

public class AddNewContacts {
    public static void main(String[] args) {
        System.out.println("*_*_*_*_*_*_*_*_*_*_Welcome to Address Book_*_*_*_*_*_*_*_*_*_*");
       AddNewContacts contact = new AddNewContacts();
        String name;
        int ch;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Enter 1 to add\n");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    contact.addContact();
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }
}
