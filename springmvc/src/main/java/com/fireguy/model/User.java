package com.fireguy.model;

/**
 * @author slfu
 */
public class User {
    /**
     * 姓名
     */
    private String userName = "";
    /**
     *登陆密码
     */
    private String passwd = "";
    /**
     * 用户类型
     */
    private int userType ;
    /**
     * 登陆用户名
     */
    private String userId;
    /**
     * 登陆密码错误次数
     */
    private int loginErrorNum = 0;

    public User(){

    }

    public User(String userName, String passwd, int userType, String userId, int loginErrorNum) {
        this.userName = userName;
        this.passwd = passwd;
        this.userType = userType;
        this.userId = userId;
        this.loginErrorNum = loginErrorNum;
    }

    public User(String userName, String passwd, int userType, String userId) {
        this.userName = userName;
        this.passwd = passwd;
        this.userType = userType;
        this.userId = userId;
        this.loginErrorNum = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLoginErrorNum() {
        return loginErrorNum;
    }

    public void setLoginErrorNum(int loginErrorNum) {
        this.loginErrorNum = loginErrorNum;
    }
}
