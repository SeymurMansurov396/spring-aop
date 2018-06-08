package com.seymur.dao;

import com.seymur.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Seymur on 6/5/2018.
 */

@Repository
public interface UserDao extends CrudRepository<User,Long> {
    public User findAllById(long id);
}
