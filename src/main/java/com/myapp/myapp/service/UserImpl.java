package com.myapp.myapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.myapp.myapp.entity.User;
import com.myapp.myapp.repository.Userrepo;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserImpl implements UserService {
    List<User> cc=new ArrayList<>();

    private Userrepo brepo;
    @Override
    public User saveData(User bank) {
        return brepo.save(bank);
    }
    @Override
    public User updateById(int id, User bd) {
        return brepo.save(bd) ;
    }
}
