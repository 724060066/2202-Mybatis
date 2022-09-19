<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>学生信息列表</title>
    <meta charset="UTF-8">
</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/student/insertStudent">
    学生编号:<input type="text" name="studentCode"><br>
    学生姓名:<input type="text" name="studentName"><br>
    年龄:<input type="text" name="age"><br>
    性别:
    <input type="radio" name="sex" value="1" checked>男
    <input type="radio" name="sex" value="2">女<br>
    电话:<input type="text" name="phone"><br>
    班级:
    <select name="classId">
        <c:forEach items="${classesList}" var="cla">
            <option value="${cla.id}">${cla.className}</option>
        </c:forEach>
    </select><br>

    <button type="submit">添加</button>
</form>
</body>
</html>
