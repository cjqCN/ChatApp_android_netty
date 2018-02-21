package com.example.a15656.test5.cjq.action.response;

import com.example.a15656.test5.cjq.action.pojo.UserState;
import java.util.List;

/**
 * Created by 15656 on 2017/5/1.
 */

enum LoginType {
    onlined,
    errpassword,
    permit
}


public class LoginResponse extends ResponseImpl {

    private LoginType loginType;
    private List<UserState> friendList;

    LoginResponse(LoginType loginType){
        this.loginType = loginType;
    }
    LoginResponse(LoginType loginType, List<UserState> friendList){
        this.loginType = loginType;
        this.friendList = friendList;
    }

    public LoginType getLoginType(){return loginType;}
    public boolean isPermitLogin(){return loginType == LoginType.permit;}
    public List<UserState> getFriendList(){return friendList;}
    public String toString(){return loginType.toString();}
}
