package com.view;
import java.util.Scanner;

public class menu {
    public static void menuAwal() {
            while(true) {
            
            System.out.print("\n=    MENU    =\n"
            + "1. Movie \n"
            + "2. Rent \n"
            + "0. Exit\n"
            + "Input [1/2] :");
            
            Scanner input = new Scanner(System.in);
            String pilihan = input.next();

            if ( pilihan.equalsIgnoreCase("0")) {
                break;
            }

            switch (pilihan) {
                case "1":
                    movieMenu.movieMenu();         
                    break;
                case "2":
                    rentMenu.rentMenu();
                    break;
                case "0":
                    System.out.println("Exit App");
                    break;            
                default:
                    System.out.println("Pilihan Tidak Ada..!");
                    break;
            }
        }
    }
}
 