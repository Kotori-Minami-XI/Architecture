package com.Kotori.Struts2;

import com.opensymphony.xwork2.ActionSupport;


public class HelloAction2 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("进入HelloAction2");
        return SUCCESS;
    }
}
