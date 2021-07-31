package com.myapp.myapp.service;

import com.myapp.myapp.entity.User;

public interface UserService {
    public User saveData(User bank);

    public User updateById(int id, User bd);
}
