package com.Kotori.myForm;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class myFormAction3 extends ActionSupport {
    private String username;
    private Integer age;
    private List hobby;

    // 提供set方法
    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public String execute(){
        System.out.println(username);
        System.out.println(age);
        System.out.println(hobby);
        return SUCCESS;
    }

}
