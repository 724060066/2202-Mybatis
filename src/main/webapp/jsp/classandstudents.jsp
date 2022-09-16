<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>学生信息列表</title>
    <meta charset="UTF-8">
</head>
<body>
<table>
    <tr>
        <th>班级</th>
        <th>学生编号</th>
        <th>学生姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>电话</th>
<%--        <th>市场部</th>--%>
<%--        <th>籍贯</th>--%>
<%--        <th>民族</th>--%>
    </tr>
    <c:forEach items="${classesList}" var="cla">
        <c:if test="${cla.studentsList.size() > 0}">
            <c:forEach items="${cla.studentsList}" var="stu">
                <tr>
                    <td>${cla.className}</td>
                    <td>${stu.studentCode}</td>
                    <td>${stu.studentName}</td>
                    <td>${stu.age}</td>
                    <td>
                        <c:if test="${stu.sex == '1'}">男</c:if>
                        <c:if test="${stu.sex == '2'}">女</c:if>
                    </td>
                    <td>${stu.phone}</td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${cla.studentsList.size() <= 0}">
            <tr>
                <td>${cla.className}</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
