package com.sda.view;

import com.sda.api.NewUserData;
import com.sda.controller.AddNewUserController;

import java.util.Scanner;

public class AddNewUserView implements View {

    private Scanner scanner;
    private AddNewUserController addNewUserController;
    @Override
    public void display() {
        addNewUserController.addNewUser(getData()).display();
    }

    public static NewUserData getData() {
        System.out.println("Provide your name");
        //scanner;
        System.out.println("Provide your lastname");
        //scanner;
        System.out.println("Provide your email");
        //scanner + walidacja;

        return null;
    }

}
