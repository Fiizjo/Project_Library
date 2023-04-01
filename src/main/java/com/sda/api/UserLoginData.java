package com.sda.api;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class UserLoginData {

    private String login;
    private String password;
}
