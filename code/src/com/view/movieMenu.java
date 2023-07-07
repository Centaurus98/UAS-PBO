package com.view;

import java.util.Scanner;

import com.models.cConfig;

public class movieMenu {

    private static Scanner input = new Scanner(System.in);

    public static void movieMenu() {
        while (true) {

            System.out.print("\n=    Movie    =\n"
                    + "1. List Movie \n"
                    + "2. Tambah Movie \n"
                    + "3. Delete Movie \n"
                    + "0. Exit\n"
                    + "Input [1/2/3] :");

            Scanner input = new Scanner(System.in);
            String pilihan = input.next();

            if (pilihan.equalsIgnoreCase("0")) {
                break;
            }

            switch (pilihan) {
                case "1":
                    listMovie();
                    break;
                case "2":
                    addMovie();
                    break;
                case "3":
                    delMovie();
                    break;
                case "0":
                    System.out.println("Exit App");
                    break;
                default:
                    System.out.println("Pilihan anda salah..!");
                    break;
            }
        }
    }

    public static void listMovie() {
        System.out.print("\n=    List Movie   =\n");
        System.out.println(cConfig.dataMovie());
    }

    public static void addMovie() {
        System.out.print("\n=    Tambah Movie   =\n");
        System.out.print("Title :");
        String title = input.nextLine();
        System.out.print("Genre :");
        String genre = input.nextLine();
        cConfig.addMovie(title, genre);
        System.out.println("SUCESS - Movie Berhasil di tambahkan..!");
    }

    public static void delMovie() {
        listMovie();
        System.out.print("Masukkan ID yang akan dihapus :");
        String movieId = input.nextLine();
        cConfig.delMovie(movieId);
    }
}
