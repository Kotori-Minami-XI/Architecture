package com.Kotori.myForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.HttpParameters;

public class myFormAction extends ActionSupport {
    @Override
    public String execute() throws Exception {

        // 获取表单的值
        ActionContext context = ActionContext.getContext();
        HttpParameters parameters = context.getParameters();

        String username = parameters.get("username").getValue();
        String[] hobby = parameters.get("hobby").getMultipleValues();

        // 存值
        // 往requst中存值
        context.put("reqName","req");
        // 往session中存值
        context.getSession().put("sessName","sess");
        // 往application中存值
        context.getApplication().put("appName","app");

        return SUCCESS;
    }
}
