<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>学生信息列表</title>
    <meta charset="UTF-8">
</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/student/updateStudentById">
    <input type="hidden" name="id" value="${student.id}">
    学生编号:<input type="text" name="studentCode" value="${student.studentCode}"><br>
    学生姓名:<input type="text" name="studentName" value="${student.studentName}"><br>
    年龄:<input type="text" name="age" value="${student.age}"><br>
    性别:
    <c:if test="${student.sex eq '1'}">
        <input type="radio" name="sex" value="1" checked>男
        <input type="radio" name="sex" value="2">女<br>
    </c:if>
    <c:if test="${student.sex eq '2'}">
        <input type="radio" name="sex" value="1" >男
        <input type="radio" name="sex" value="2" checked>女<br>
    </c:if>
    电话:<input type="text" name="phone" value="${student.phone}"><br>
    班级:
    <select name="classId">
        <c:forEach items="${classesList}" var="cla">
            <c:if test="${student.classId == cla.id}">
                <option value="${cla.id}" selected>${cla.className}</option>
            </c:if>
            <c:if test="${student.classId != cla.id}">
                <option value="${cla.id}">${cla.className}</option>
            </c:if>
        </c:forEach>
    </select><br>

    <button type="submit">修改</button>
</form>
</body>
</html>
