package com.Kotori.Struts2;

import com.opensymphony.xwork2.ActionSupport;

public class goods extends ActionSupport {
    public String find(){
        System.out.println("goods find");
        return SUCCESS;
    }

    public String delete(){
        System.out.println("goods delete");
        return SUCCESS;
    }

    public String update(){
        System.out.println("goods update");
        return SUCCESS;
    }
}
