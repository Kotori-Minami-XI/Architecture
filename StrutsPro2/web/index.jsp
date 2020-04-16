<%--
  Created by IntelliJ IDEA.
  User: xz
  Date: 2020/4/16
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <h1>action context获取参数</h1>
  <form action="${pageContext.request.contextPath}/myForm.action">
    用户名:<input type="text" placeholder="请输入用户名..." name="username"><br/>
    昵称:<input type="text" placeholder="请输入用户名..." name="nick"><br/>
    爱  好: <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br/>
    <input type="submit" value="提交">
  </form>

  <hr>

  <h1>原生api获取参数</h1>
  <form action="${pageContext.request.contextPath}/myForm2.action">
    用户名:<input type="text" placeholder="请输入用户名..." name="username"><br/>
    昵称:<input type="text" placeholder="请输入用户名..." name="nick"><br/>
    爱  好: <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br/>
    <input type="submit" value="提交">
  </form>

  <hr>

  <h1>1. 提供属性set方式来获取参数</h1>
  <form action="${pageContext.request.contextPath}/myForm3.action">
    用户名:<input type="text" placeholder="请输入用户名..." name="username"><br/>
    年龄:<input type="text" placeholder="请输入年龄..." name="age"><br/>
    爱  好: <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br/>
    <input type="submit" value="提交">
  </form>

  <hr>

  <h1>2. 页面提供表达式方法获取参数</h1>
  <form action="${pageContext.request.contextPath}/myForm4.action">
    用户名:<input type="text" placeholder="请输入用户名..." name="user.username"><br/>
    年龄:<input type="text" placeholder="请输入年龄..." name="user.age"><br/>
    爱  好: <input type="checkbox" value="足球" name="user.hobby">足球
    <input type="checkbox" value="篮球" name="user.hobby">篮球
    <input type="checkbox" value="乒乓球" name="user.hobby">乒乓球<br/>
    <input type="submit" value="提交">
  </form>

  <hr>

  <h1>3. 模型驱动方式获取参数</h1>
  <form action="${pageContext.request.contextPath}/myForm5.action">
    用户名:<input type="text" placeholder="请输入用户名..." name="username"><br/>
    年龄:<input type="text" placeholder="请输入年龄..." name="age"><br/>
    爱  好: <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br/>
    <input type="submit" value="提交">
  </form>

  <hr>

  </body>
</html>
