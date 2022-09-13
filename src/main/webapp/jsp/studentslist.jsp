<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>学生信息列表</title>
    <meta charset="UTF-8">
</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/student/listStudent">
    学生编号:<input type="text" name="studentCode">
    学生姓名:<input type="text" name="studentName">
    性别:
    <select name="sex">
        <option value="">--请选择--</option>
        <option value="1">男</option>
        <option value="2">女</option>
    </select>
    <button type="submit">查询</button>
</form>
<table>
    <tr>
        <th>学生编号</th>
        <th>学生姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>电话</th>
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
            <td>${students.phone}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
