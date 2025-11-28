<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head><title>名前入力</title></head>
<body>
    <h2>名前を入力してください</h2>
    <!-- action に web.xml で設定したサーブレットのURLパターンを指定 -->
    <form action="GitInputServlet" method="get">
        姓: <input type="text" name="last"><br>
        名: <input type="text" name="first"><br>
        <input type="submit" value="送信">
    </form>
</body>
</html>
