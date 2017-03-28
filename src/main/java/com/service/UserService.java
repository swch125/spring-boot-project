package com.service;

import com.domain.User;

/**
 * Created by Eric.sun on 2017/3/23.
 */
public interface UserService {

    public User addUserWithBackId(String loginname, String age);

    public User getUserInfo(String loginname);
}
