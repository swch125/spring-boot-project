package com.util;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * Created by Eric.sun on 2017/3/28.
 */
public class CommonUtil {
    /**
     * 用户密码生成规则
     * @param password
     * @return
     */
    public static String md5Password(String password){
        return new SimpleHash("md5",password, null,1).toHex();
    }
}
