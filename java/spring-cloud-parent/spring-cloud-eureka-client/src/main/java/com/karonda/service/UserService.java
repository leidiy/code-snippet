package com.karonda.service;

import com.karonda.entity.User;

public interface UserService {

    User create(String username, String password);
}
