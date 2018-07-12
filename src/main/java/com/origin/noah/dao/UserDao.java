package com.origin.noah.dao;

import com.origin.noah.model.domain.UserDO;

/**
 * Created by dengqingling on 2018/5/19
 */
public interface UserDao {

    int insert(UserDO userDO);

    int update(UserDO userDO);

    int deleteById(Long id);

    UserDO getById(Long id);

}
