package com.fireguy.service;

import com.fireguy.dao.UserDao;
import com.fireguy.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author slfu
 */
@Service("userService")
public class UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    public List<User> getAllUsers(){
        return userDao.findAll();
    }
}
