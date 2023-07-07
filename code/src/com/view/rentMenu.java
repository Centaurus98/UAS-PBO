package com.view;

import java.util.Scanner;

import com.models.cConfig;

public class rentMenu {
    private static Scanner input = new Scanner(System.in);

    public static void rentMenu() {
        while (true) {

            System.out.print("\n=    RENT    =\n"
                    + "1. Rent List \n"
                    + "2. Add Rent \n"
                    + "3. Return Rent \n"
                    + "4. Delete Data Rent \n"
                    + "0. Exit\n"
                    + "Input [1/2/3/4] :");

            Scanner input = new Scanner(System.in);
            String pilihan = input.next();

            if (pilihan.equalsIgnoreCase("0")) {
                break;
            }

            switch (pilihan) {
                case "1":
                    allRentList();
                    activeRentList();
                    break;
                case "2":
                    addRent();
                    break;
                case "3":
                    returnRent();
                    break;
                case "4":
                    delRent();
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

    public static void allRentList() {
        System.out.print("\n=    List Semua Movie   =\n");
        System.out.println(cConfig.dataRent());
    }

    public static void activeRentList() {
        System.out.print("\n=    List Rent Aktif   =\n");
        System.out.println(cConfig.activeRent());
    }

    public static void addRent() {
        System.out.print("\n=    Tambah Rent   =\n");
        System.out.println(cConfig.dataMovie());
        System.out.print("Masukkan ID Movie yang akan di pinjam :");
        String movieId = input.nextLine();
        System.out.print("Masukan tiket anda :");
        String ticketRent = input.nextLine();
        cConfig.addRent(movieId,ticketRent);
        System.out.println("SUCESS - Film berhasil dipinjam");
    }

    public static void returnRent() {
        System.out.print("\n=    Kembalikan Rent   =\n");
        activeRentList();
        System.out.print("Masukkan ID Movie yang akan di kembalikan :");
        String movieId = input.nextLine();
        cConfig.returnRent(movieId);
        System.out.println("SUCESS - Film berhasil di kembalikan");
    }

    public static void delRent() {
        allRentList();
        System.out.print("Masukkan ID yang akan di hapus :");
        String rentId = input.nextLine();
        cConfig.delRent(rentId);
    }

}
