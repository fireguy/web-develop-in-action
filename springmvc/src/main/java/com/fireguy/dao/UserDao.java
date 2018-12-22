package com.fireguy.dao;

import com.fireguy.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author slfu
 */
@Repository("userDao")
public class UserDao {

    public List<User> findAll() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("付绍林", "123", 1, "slfu"));

        return userList;
    }
}
