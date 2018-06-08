package com.seymur.controllers;

import com.seymur.model.User;
import com.seymur.service.UserDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by Seymur on 6/5/2018.
 */

@RestController
@RequestMapping("/users")
public class UserController {

    private static  final Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserDaoImpl userDao;
    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> create(@RequestBody User user){
        logger.info("User: "+user);
        userDao.save(user);
        if(userDao.save(user)>0){
            return  new ResponseEntity<User>(user,HttpStatus.CREATED);
        }
        return null;

    }
    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        List<User> users=userDao.findAllUsers();
        if(users!=null && users.size()>0){
            return new ResponseEntity<List<User>>(users,HttpStatus.OK);
        }else {
            return new ResponseEntity<List<User>>(users,HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping("/{id}")
    public  ResponseEntity<User> findAllById(@PathVariable("id") long id){
        User user=userDao.findById(id);
       logger.info(user.getName());
        if(user!=null){
            return  new ResponseEntity<User>(user,HttpStatus.OK);
        }else {

            return  new ResponseEntity<User>(user,HttpStatus.NOT_FOUND);
        }


    }



}
