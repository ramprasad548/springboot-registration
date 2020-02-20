package com.springboot.auth.service;

import com.springboot.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
