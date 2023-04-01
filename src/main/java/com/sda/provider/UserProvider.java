package com.sda.provider;

import com.sda.model.User;

import java.util.Optional;
import java.util.Set;

public interface UserProvider {

    Set<User> getAllUsers();
    Optional<User> findUserByLogin(String login);
}
