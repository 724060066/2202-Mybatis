<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>学生信息列表</title>
    <meta charset="UTF-8">
</head>
<body>
<p>班级：${cName}</p>
<table>
    <tr>
        <th>学生编号</th>
        <th>学生姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>市场部</th>
        <th>籍贯</th>
    </tr>
    <c:forEach items="${studentsList}" var="students">
        <tr>
            <td>${students.studentCode}</td>
            <td>${students.studentName}</td>
            <td>${students.age}</td>
            <td>
                <c:if test="${students.sex == '1'}">男</c:if>
                <c:if test="${students.sex == '2'}">女</c:if>
            </td>
            <td>${students.dangan.shichangbu}</td>
            <td>${students.dangan.jiguan}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
