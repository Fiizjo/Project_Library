package com.sda.controller;

import com.sda.api.NewUserData;
import com.sda.view.MainMenuView;
import com.sda.view.View;

public class AddNewUserControllerImpl implements AddNewUserController {

    @Override
    public View addNewUser(NewUserData newUserData) {

        return new MainMenuView();
    }


}
