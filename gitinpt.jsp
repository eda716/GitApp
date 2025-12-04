<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>名前入力フォーム</title>
</head>
<body>
    <h2>名前を入力してください</h2>
    <form action="GitInputServlet" method="post">
        姓: <input type="text" name="lastName"><br>
        名: <input type="text" name="firstName"><br>
        <input type="submit" value="送信">
    </form>
</body>
</html>

