package com.view;
import java.util.Scanner;

import com.entity.userEntity;
import com.models.cConfig;

public class login {

    public static void ShowLoginPage() {
        
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("\n=    LOGIN    =\n");

        System.out.print("name :");
        String id_user = inputScanner.nextLine();

        System.out.print("password :");
        String password = inputScanner.nextLine();


        cConfig LoginUsecase = new cConfig();
        String sValidate = LoginUsecase.LoginValidate(id_user, password);

        if (sValidate.equals("")) {
            System.out.println();
            System.out.println("LOGIN SUCCESS..!");
            System.out.println(cConfig.ticketRent(id_user));
            menu.menuAwal();
            
        } else {
            System.out.println();
            System.out.println("LOGIN FAILED - " +sValidate);
            welcome.main(null);
        }
    }
}