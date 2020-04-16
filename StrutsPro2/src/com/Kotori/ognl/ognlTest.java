package com.Kotori.ognl;


import com.Kotori.domain.User;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

import java.util.Map;
import java.util.Random;

public class ognlTest {

    /***
     * 往根对象中存储数据
     * @throws OgnlException
     */
    @Test
    public void test() throws OgnlException {
        OgnlContext ognlContext = new OgnlContext();
        ognlContext.setRoot("123");
        Object root = ognlContext.getRoot();
        System.out.println(root);

        User user = new User();
        user.setAge(12);
        user.setUsername("ls");
        ognlContext.setRoot(user);

        root = ognlContext.getRoot();
        Object age = Ognl.getValue("age", ognlContext, root);
        System.out.println(age);
    }

    /***
     * 往非根对象中存储数据
     */
    @Test
    public void test2() throws OgnlException {
        User user = new User();
        user.setAge(12);
        user.setUsername("ls");

        OgnlContext ognlContext = new OgnlContext();
        ognlContext.put("user", user);
        Object root = ognlContext.getRoot();

        User u = (User)Ognl.getValue("#user", ognlContext, root);
        System.out.println(u.getAge());
        System.out.println(u.getUsername());
    }

    /***
     * 调用原生的方法
     */
    @Test
    public void test3() throws OgnlException {

        OgnlContext ognlContext = new OgnlContext();
        Object root = ognlContext.getRoot();

        // 调用普通方法
        Object obj = Ognl.getValue("'hello'.length()", ognlContext, root);
        System.out.println(obj);

        // 调用静态方法
        obj = Ognl.getValue("@java.lang.Math@random()", ognlContext, root);
        System.out.println(obj);
    }

}
