package com.xwq.util;

import com.xwq.vo.LoginInfo;


/**
 * @author PARADISE
 */
public class UserContext {

    /**
     * 把登录信息存储到Session
     */
    public static void setLoginInfo(LoginInfo loginInfo){
        //把loginInfo保存到session
    }

    /**
     * 从Session获取登录信息
     * @return LoginInfo
     */
    public static LoginInfo getLoginInfo(){
        return new LoginInfo(42L,"yhptest1",26L,"源码时代");
    }
}
