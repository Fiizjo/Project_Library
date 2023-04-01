package com.sda.api;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Value;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class UserLoginData {

    private String login;
    private String password;
}
