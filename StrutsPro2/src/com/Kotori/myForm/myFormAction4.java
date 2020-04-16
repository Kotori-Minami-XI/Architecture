package com.Kotori.myForm;

import com.Kotori.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class myFormAction4 extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String execute(){
        System.out.println(user);
        return SUCCESS;
    }
}
