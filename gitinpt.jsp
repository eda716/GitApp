<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head><title>名前入力</title></head>
<body>
    <h2>名前を入力してください</h2>
    <form action="name" method="get">
        姓: <input type="text" name="last"><br>
        名: <input type="text" name="first"><br>
        <input type="submit" value="送信">
    </form>

    <hr>
    <h2>入力された名前</h2>
    <p>姓: ${lastName}</p>
    <p>名: ${firstName}</p>
</body>
</html>
