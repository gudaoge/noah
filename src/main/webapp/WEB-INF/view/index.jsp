<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello world</title>
</head>
<body>
    <div id="content">
        <h2>
            欢迎${user.name}
        </h2>
        <div>
            <span>${user.displayName}</span>
            <br>
            <span>${user.password}</span>
        </div>
    </div>
</body>
</html>
