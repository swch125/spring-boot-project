package com.mapper;

import com.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Eric.sun on 2017/3/23.
 */
@Repository
public interface UserMapper {
    /**
     * 插入用户，并将主键设置到user中
     * 注意：返回的是数据库影响条数，即1
     */
    public int insertUserWithBackId(User user);

    public User getUserInfo(User user);
}
