package com.sda.controller;

import com.sda.api.UserLoginData;
import com.sda.model.Book;
import com.sda.view.View;

import java.util.List;

public interface UserLoginController {

    View login(UserLoginData userLoginData);


}
