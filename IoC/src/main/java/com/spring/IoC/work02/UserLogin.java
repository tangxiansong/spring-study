package com.spring.IoC.work02;

public class UserLogin {
    private User user;

    public UserLogin() {

    }

    public UserLogin(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean userLogin(User user) {
        if (user.getAccount() == "admin" && user.getPassword() == "111 ") {
            return true;
        } else {
            return false;
        }
    }
}
