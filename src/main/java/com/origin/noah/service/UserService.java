package com.origin.noah.service;

import com.origin.noah.model.domain.UserDO;

/**
 * Created by dengqingling on 2018/5/19
 */
public interface UserService {

    int insert(UserDO userDO);

    int update(UserDO userDO);

    int deleteById(Long id);

    UserDO getById(Long id);
}
