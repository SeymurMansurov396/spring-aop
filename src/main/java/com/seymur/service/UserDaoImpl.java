package com.seymur.service;

import com.seymur.dao.UserDao;
import com.seymur.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Seymur on 6/5/2018.
 */

@Service
public class UserDaoImpl{
    @Autowired
    private UserDao userDao;

    public long save(User user){
       return userDao.save(user).getId();
    }

    public List<User> findAllUsers(){
        return (List<User>) userDao.findAll();
    }
    public User findById(long id){
        return userDao.findAllById(id) ;
    }


}
