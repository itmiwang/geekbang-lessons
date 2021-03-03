<html>
<head>
    <jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
    <title>注册页面</title>
</head>
<body>
    <div class="container">
        <h1>用户注册</h1>
        <form action="/register" method="post">
            <table>
                <tr>
                    <td>账号：<input name="username" type="text"></td>
                </tr>
                <tr>
                    <td>密码：<input name="password" type="text"></td>
                </tr>
                <tr>
                    <td><input name="submit" type="submit" value="注册"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
