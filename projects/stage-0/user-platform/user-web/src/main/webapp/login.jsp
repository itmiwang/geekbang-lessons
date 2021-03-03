<html>
<head>
    <jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
    <title>登录页面</title>
</head>
<body>
    <div class="container">
        <div>用户登录</div>
        <form action="/register" method="post">
            <table>
                <tr>
                    <td>用户：<input name="user" type="text"></td>
                </tr>
                <tr>
                    <td>密码：<input name="password" type="text"></td>
                </tr>
                <tr>
                    <td><input name="submit" type="submit" value="提交"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
