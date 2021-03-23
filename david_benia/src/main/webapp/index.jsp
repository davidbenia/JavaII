<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Animal Registration</title>
</head>
<body>
<h3>შინაური ცხოველების სარეგისტრაციო ფორმა
</h3>
<br/>
<form action="animalservlet" method="post">
    <label for="name">სახელი</label>
    <input type="text" id="name" name="name">
    <br><br>

    <label for="breed">ჯიში</label>
    <input type="text" id="breed" name="breed">
    <br><br>

    <label for="gender">სქესი</label>
    <input type="text" id="gender" name="gender">
    <br><br>

    <label for="age">ასაკი</label>
    <input type="number" id="age" name="age">
    <br><br>

    <input type="submit" value="რეგისტრაცია">

</form>
</body>
</html>