package com.Kotori.myForm;

import com.Kotori.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class muFormAction5 extends ActionSupport implements ModelDriven<User> {
    private User user = new User();

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }
}
