package com.origin.noah.service.impl;

import com.origin.noah.dao.UserDao;
import com.origin.noah.model.domain.UserDO;
import com.origin.noah.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dengqingling on 2018/5/19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public int insert(UserDO userDO) {
        return userDao.insert(userDO);
    }

    public int update(UserDO userDO) {
        return userDao.update(userDO);
    }

    public int deleteById(Long id) {
        return userDao.deleteById(id);
    }

    public UserDO getById(Long id) {
        return userDao.getById(id);
    }
}
