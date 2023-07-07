package com.view;

import java.util.Scanner;

import com.models.cConfig;

public class createMenu {
    private static Scanner input = new Scanner(System.in);

    public static void createMenu() {
            while(true) {
            
            System.out.print("\n=    MENU    =\n"
            + "1. Register \n"
            + "2. Change Password \n"
            + "0. Exit\n"
            + "Input [1/2] :");
            
            String pilihan = input.next();

            if ( pilihan.equalsIgnoreCase("0")) {
                break;
            }

            switch (pilihan) {
                case "1":
                    register();
                    break;
                case "2":
                    changePassword();
                    break;
                case "0":
                    System.out.println("Exit App");
                    break;            
                default:
                    System.out.println("Pilihan Salah!!!");
                    break;
            }
        }
    }

    public static void register() {

        System.out.println("\n=    REGISTER    =");

        System.out.print("username : ");
        String regUsername = input.next();
        System.out.print("password : ");
        String regPass = input.next();
        System.out.print("input password ulang: ");
        String regPass2 = input.next();

        if(regPass.equals(regPass2)) {
            System.out.println("REGISTER SUCCES..!");
            cConfig.register(regUsername, regPass);
        } else {
            System.out.println("password tidak match");
            System.out.println("user gagal di tambahkan..!!");
        }
    }

    public static void changePassword() {
        
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("\n=    VALIDATION    =\n");

        System.out.print("name :");
        String userid = inputScanner.nextLine();

        System.out.print("password :");
        String pass = inputScanner.nextLine();


        cConfig LoginUsecase = new cConfig();
        String sValidate = LoginUsecase.LoginValidate(userid, pass);

        if (sValidate.equals("")) {
            System.out.print("password baru :");
            String passBaru = inputScanner.nextLine();
            System.out.print("ulang password baru :");
            String passBaru2 = inputScanner.nextLine();
            if(passBaru.equals(passBaru2)) {
                System.out.println("SUCESS - Password has been updated");
                cConfig.upPassDataUser(userid,passBaru);
            } else {
                System.out.println("FAILED - Password not match");
            }
            
        } else {
            System.out.println();
            System.out.println("LOGIN FAILED - " +sValidate);
            createMenu();
        }
    }

    public static void dataUser() {

        System.out.println("\n=    REGISTER    =");
        System.out.println(cConfig.dataUser());
    }
}
