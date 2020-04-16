package com.Kotori.Struts2;

import com.opensymphony.xwork2.ActionSupport;

public class methods extends ActionSupport {
    public String add(){
        System.out.println("add");
        return SUCCESS;
    }

    public String delete(){
        System.out.println("delete");
        return SUCCESS;
    }

    public String update(){
        System.out.println("update");
        return SUCCESS;
    }

    public String query(){
        System.out.println("query");
        return SUCCESS;
    }
}
