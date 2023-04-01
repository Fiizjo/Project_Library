package com.sda.view;

import com.sda.api.NewUserData;
import com.sda.controller.AddNewUserController;
import com.sda.provider.UserProvider;

import java.util.Scanner;

public class AddNewUserView implements View {

    private Scanner scanner;
    private AddNewUserController addNewUserController;

    private UserProvider userProvider;
    @Override
    public void display() {
        addNewUserController.addNewUser(getData()).display();
    }

    NewUserData getData() {
        System.out.println("Provide your name");
        String newUserName = scanner.nextLine();
        System.out.println("Provide your lastname");
        String newUserLastName = scanner.nextLine();

        System.out.println("Provide your login");
        String newUserLogin = getAndCheckUserLogin();

        System.out.println("Provide your email");
        String newUserEmail = scanner.nextLine();
        System.out.println("Provide your password");
        String newUserPassword = scanner.nextLine();
        System.out.println("Provide your Address");
        String newUserAddress = scanner.nextLine();

        return null;
    }

    private String getAndCheckUserLogin() {
        String newUserLogin = scanner.nextLine();
        if (userProvider.findUserByLogin(newUserLogin).isPresent()) {
            System.out.println("Login already exist!");
            return getAndCheckUserLogin();
        }
        return newUserLogin;
    }

}
