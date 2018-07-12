<%--
  created by dengqingling on 2018/5/21
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页</title>
</head>
<body>
    <div>
        <form action="/login/submit" method="post" onsubmit="return checkForm(this)">
            <input name="userName" placeholder="用户名">
            <input name="password" type="password" placeholder="密码">
            <input type="submit">
        </form>
    </div>
</body>

<script>
    function checkForm() {
        return true;
    }
</script>
</html>
