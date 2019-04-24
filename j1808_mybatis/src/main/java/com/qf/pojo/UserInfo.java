package com.qf.pojo;

/**
 * Created by lzp on 2019/2/21 9:45
 */
public class UserInfo {
    private  int userID;
    private String password;
    private String userName;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userID=" + userID +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
