package com.Kotori.myForm;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class myFormAction2 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        // 原生api获取context

        HttpServletRequest request = ServletActionContext.getRequest();

        String username = request.getParameter("username");
        String nick = request.getParameter("nick");
        String[] hobbies = request.getParameterValues("hobby");

        // 往requst中存值
        request.setAttribute("reqName","req");
        // 往session中存值
        request.getSession().setAttribute("sessName","sess");
        // 往application中存值
        ServletActionContext.getServletContext().setAttribute("appName","app");


        return SUCCESS;
    }
}
